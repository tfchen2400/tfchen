package com.hangzhou.tfchen.test;

import com.hangzhou.tfchen.persistence.ResultBean;
import net.sf.json.JSONObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/19 9:50
 * @描述：
 * @注意事项：
 */
public class A {
    public static void main(String[] args) {
//        String mqinfo = "tcp://192.168.200.151:61615?wireFormat.maxInactivityDuration=0&wireFormat.maxInactivityDurationInitalDelay=30000;1;5";
//        String[] mqarr = mqinfo.split(";");
//        String[] tmparr = mqarr[0].split("\\?")[0].split("\\/\\/")[1].split(":");
//        Integer logonNumber = Integer.valueOf(mqarr[1]);
//        Integer accessNumber = Integer.valueOf(mqarr[2]);
//        Map<String,Object> mqm=new HashMap<String, Object>();
//        mqm.put("url", mqarr[0]);
//        mqm.put("host",tmparr[0]);
//        mqm.put("port",tmparr[1]);
////        mqm.put("queueName", "logon"+(i+1));
//        mqm.put("type", "logon");
//        ResultBean resultBean = new ResultBean();
//        System.out.println(resultBean.hashCode());


        Random r1 = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(r1.nextInt(2));
        }
        HashMap map = new HashMap();

    }


}
