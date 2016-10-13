package com.hangzhou.tfchen.webservice.Impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.log4j.Logger;

/**
 * 
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年10月13日 上午10:59:01 
 * @描述： restful获取ip 
 * @注意事项：
 *
 */
public class BaseRestful {

	private Logger logger = Logger.getLogger(BaseSoap.class);

	@Context
	private MessageContext messgeContext;

	public String getIp() {
		try {
			HttpServletRequest request = messgeContext.getHttpServletRequest();
			return request.getRemoteAddr();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("获取 发送短信客户端的Ip地址 失败：" + e);
			return "";
		}

	}

}
