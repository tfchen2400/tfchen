package com.hangzhou.tfchen.slor;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/2/4 9:16
 * @描述：
 * @注意事项：
 */
public class SolrCloudTest {

    public static final Logger log = Logger.getLogger(SolrCloudTest.class);

    private static CloudSolrServer cloudSolrServer;

    public SolrCloudTest() {
    }

    private static synchronized CloudSolrServer getCloudSolrServer(final String zkHost) {
        log.info("connect to :" + zkHost + "\n");
        if (cloudSolrServer == null) {
            try {
                cloudSolrServer = new CloudSolrServer(zkHost);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cloudSolrServer;
    }

    private void addIndex(SolrServer solrServer) {
        Long startTime = System.currentTimeMillis();
        int jCount = 20;
        int iCount = 10000;
        try {
            for (int j = 0; j < jCount; j++) {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                String keyFor = sdf.format(date);
                String keyMid = j + 1000 + "";
                Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
                for (int i = 0; i <= iCount; i++) {
                    SolrInputDocument doc = new SolrInputDocument();
                    String keyLast = 1000 + String.valueOf(i);
                    String key = keyFor + keyMid + keyLast;
                    doc.addField("id", key);
                    doc.addField("test_s", key + "value");
                    docs.add(doc);
                }
                log.info("docs info:" + docs + "\n");
//                System.out.println("docs length " + docs.size());
                solrServer.add(docs);
            }
            solrServer.commit();
        } catch (SolrServerException e) {
            System.out.println("Add docs Exception !!!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unknowned Exception!!!!!");
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        Long totalCost = endTime - startTime;
        System.out.println("=====");
        System.out.println("total:" + (jCount * iCount) + "cost time:" + totalCost);
        System.out.println(jCount * iCount / (totalCost / 1000));
    }

    public void search(SolrServer solrServer, String Str) {
        SolrQuery query = new SolrQuery();
        query.setRows(20); //默认row是10，只返回10条，如果设置query.setRows(Integer. MAX_VALUE)会报错，默认最大为2147483391
        query.setQuery(Str);
        try {
            log.info("query string: " + Str);
            System.out.println("query string: " + Str);
            QueryResponse response = solrServer.query(query);
            SolrDocumentList docs = response.getResults();
            System.out.println(docs);
            System.out.println(docs.size());
            System.out.println("doc num:" + docs.getNumFound());
            System.out.println("elapse time:" + response.getQTime());
            for (SolrDocument doc : docs) {
                String area = (String) doc.getFieldValue("test_s");
                String id = (String) doc.getFieldValue("id");
                System.out.println("id: " + id);
                System.out.println("tt_s: " + area);
                System.out.println();
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAllIndex(SolrServer solrServer) {
        try {
            solrServer.deleteByQuery("*:*");
            solrServer.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final String zkHost = "master-hadoop:9983";
        final String defaultCollection = "chentf";
        final int zkClientTimeout = 10000;
        final int zkConnectTimeout = 10000;
        CloudSolrServer cloudSolrServer = getCloudSolrServer(zkHost);
        cloudSolrServer.setDefaultCollection(defaultCollection);
        cloudSolrServer.setZkClientTimeout(zkClientTimeout);
        cloudSolrServer.setZkConnectTimeout(zkConnectTimeout);
        try {
            cloudSolrServer.connect();
            System.out.println("connect solr cloud zk sucess");
        } catch (Exception e) {
            log.error("connect to collection " + defaultCollection + " error\n");
            System.out.println("error message is:" + e);
            e.printStackTrace();
            System.exit(1);
        }
        //ZkStateReader zkStateReader = cloudSolrServer.getZkStateReader();
        //ClusterState cloudState  = zkStateReader.getClusterState();
        //System.out.println(cloudState);

        SolrCloudTest solrt = new SolrCloudTest();
        System.out.println("=====");
        try {
            solrt.addIndex(cloudSolrServer);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        solrt.search(cloudSolrServer, "id:*");
        //solrt.deleteAllIndex(cloudSolrServer);
        System.out.println("hashCode" + solrt.hashCode());
        cloudSolrServer.shutdown();
    }
}
