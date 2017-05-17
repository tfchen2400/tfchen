package com.hangzhou.tfchen.common.controller;

import com.hangzhou.tfchen.common.bean.Content;
import com.hangzhou.tfchen.common.bean.User;
import com.hangzhou.tfchen.common.dao.IContentDao;
import com.hangzhou.tfchen.common.service.IUserService;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 14:24
 * @描述：
 * @注意事项：
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private IContentDao contentDao;

    //空构造
    public UserController() {
    }

    @RequestMapping("/login")
    public String loginPage(Map<String, Object> map) {
        Content content = contentDao.findContent(1);
        map.put("title", content);
        return "login";
    }

    @RequestMapping("/dologin")
    public String doLogin(HttpServletRequest req, User user, Map<String, Object> map) {
        String returnView = "login";
//        // 验证user
//        User temp = null;
//        try {
////            temp = userService.doLogin(user);
//            if (temp != null) {
//                req.getSession().setAttribute("userInfo", temp);
//                returnView = "redirect:/mainPage";
//            } else {
////                Content content = contentDao.findContent(1);
////                map.put("title", content);
//                map.put("msg", "用户名密码错误");
//            }
//        } catch (SQLException e) {
//            logger.error(e);
//            e.printStackTrace();
//        }
        return returnView;
    }


    @RequestMapping("/loginOut")
    public String doLogin(HttpServletRequest req) {
        req.getSession().invalidate();
        return "redirect:/login";
    }

}
