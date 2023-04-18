package com.xxxx.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化。。。。。。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String login_flag = (String) request.getSession().getAttribute("login_flag");
        System.out.println("login_flag = " + login_flag);
        System.out.println("request.getContextPath() = " + request.getContextPath());
        if (Objects.isNull(login_flag)) {
            //给前端个提示，先登入 TODO

            //跳转到loginT
//            response.sendRedirect("../login.jsp");
//            /private/
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁。。。。。。。。。");

    }
}
