package com.hangzhou.tfchen.common.controller;

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

    @RequestMapping("/mainPage")
    public String mainPage(Map<String, Object> map) {
        return "mainPage";
    }
}
