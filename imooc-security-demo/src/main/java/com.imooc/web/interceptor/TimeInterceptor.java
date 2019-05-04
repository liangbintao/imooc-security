package com.imooc.web.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @ClassName TimeInterceptor
 * @Description TODO
 * @Auther lbt
 * @Date 2019/5/3/003 13:56
 * @Version 1.0
 */
@Component
public class TimeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

//        System.out.println("preHandle");
//
//        System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
//        System.out.println(((HandlerMethod) handler).getMethod().getName());
//
//        request.setAttribute("startTime", new Date().getTime());

//        throw new LoginException("未登录");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

//        System.out.println("postHandle");
//        Long startTime = (Long) request.getAttribute("startTime");
//
//        System.out.println("执行耗时：" + (new Date().getTime() - startTime));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

//        System.out.println("afterCompletion");
//
//        Long startTime = (Long) request.getAttribute("startTime");
//
//        System.out.println("执行耗时：" + (new Date().getTime() - startTime));
//
//        System.out.println("异常信息：" + ex);
    }
}
