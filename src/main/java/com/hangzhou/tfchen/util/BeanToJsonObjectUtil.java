package com.hangzhou.tfchen.util;

import java.util.Date;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

public class BeanToJsonObjectUtil {
	private static BeanToJsonObjectUtil beanToJsonObjectUtil;

	private BeanToJsonObjectUtil() {
		// TODO Auto-generated constructor stub
	}

	public static BeanToJsonObjectUtil getInstance() {
		if (beanToJsonObjectUtil == null)
			beanToJsonObjectUtil = new BeanToJsonObjectUtil();
		return beanToJsonObjectUtil;
	}

	public JSONObject beanToJsonObject(Object bean) {
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		jsonConfig.setJsonPropertyFilter(new IgnoreFieldProcessorImpl(new String[] { "points", "lableOne", "lableTwo" })); // 忽略掉name属性及集合对象
		JSONObject res = JSONObject.fromObject(bean, jsonConfig);
		return res;
	}
}
