package com.hangzhou.tfchen.common.controller;

import com.hangzhou.tfchen.db.DBOperator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 16:41
 * @描述：
 * @注意事项：
 */
@Controller
public class MainController {

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/mainPage")
    public String mainPage(Map<String, Object> map) throws Exception {
        return "mainPage";
    }
}
