//package com.xxxx.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// *
// */
//
//@WebServlet("/*")
//public class LoginAccessFilter implements javax.servlet.Filter {
//
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
//                         FilterChain filterChain) throws IOException, ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        String url =request.getRequestURI();
//        System.out.println(url);
//        if(url.contains("/login.jsp")){
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        response.sendRedirect("login.jsp");
//
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
