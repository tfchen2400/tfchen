package com.hangzhou.tfchen.webservice.Impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.apache.log4j.Logger;
/**
 * author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月13日 上午10:50:20
 * @描述： 提供获取IP的方法 
 * @注意事项：
 *
 */
public class BaseSoap {
	
	private Logger logger = Logger.getLogger(BaseSoap.class);
	
	
	@Resource(name = "org.apache.cxf.jaxws.context.WebServiceContextImpl")
	private WebServiceContext context;

	public String getIp() {
		try {
			MessageContext ctx = context.getMessageContext();
			HttpServletRequest request = (HttpServletRequest) ctx.get(AbstractHTTPDestination.HTTP_REQUEST);
			String ip = request.getRemoteAddr();
			return ip;
		} catch (Exception e) {
			logger.error("获取 发送短信客户端的Ip地址 失败：" + e);
			return "";
		}
	}
}
