package com.hangzhou.tfchen.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录过滤器
 *
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016年11月22日 下午2:50:21 @描述： @注意事项：
 */
public class UserInterceptor implements HandlerInterceptor {

    private static final List<String> needSession = new ArrayList<String>();

    static {
        needSession.add("/login");
        needSession.add("/dologin");

//		needSession.add("/userList");
//		needSession.add("/userAddPage");
//		needSession.add("/userAdd");
//		needSession.add("/userRemove");
//		needSession.add("/userModifyPage");
//		needSession.add("/userModify");
//		needSession.add("/userMethodListPage");
//		needSession.add("/userMethodAddPage");
//		needSession.add("/userMethodAdd");
//		needSession.add("/userMethodRemove");
//		needSession.add("/userMethodModifyPage");
//		needSession.add("/userMethodModify");
    }

    public UserInterceptor() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // TODO Auto-generated method stub
        Object sessionObj = request.getSession().getAttribute("userInfo");
        String url = request.getServletPath();
        if (url.startsWith("/css/") || url.startsWith("/dist/") || url.startsWith("/img/") || url.startsWith("/js/")) {
            return true;
        } else if (needSession.contains(url) || sessionObj != null) {
//			String path = request.getContextPath();
//			response.sendRedirect(path + "/login");
            return true;
        } else {
            String path = request.getContextPath();
            response.sendRedirect(path + "/login");
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // TODO Auto-generated method stub

    }

}
