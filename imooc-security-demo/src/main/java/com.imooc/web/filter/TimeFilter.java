package com.imooc.web.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * @ClassName TimeFilter
 * @Description TODO
 * @Auther lbt
 * @Date 2019/5/3/003 13:30
 * @Version 1.0
 */
//@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

//        long startTime = new Date().getTime();
        chain.doFilter(request, response);

//        System.out.println("执行耗时：" + (new Date().getTime() - startTime) + "毫秒");
    }

    @Override
    public void destroy() {

    }
}
