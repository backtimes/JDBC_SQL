//package com.xxxx.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//
///**
// * 字符乱码处理
// */
//@WebFilter("/*")
//public class AEncodingFilter implements Filter {
//
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain) throws IOException, ServletException {
//
//        HttpServletRequest request=(HttpServletRequest) arg0;
//        HttpServletResponse response=(HttpServletResponse) arg1;
//
//        request.setCharacterEncoding("UTF-8");
//        String method=request.getMethod();
//
//        if("GET".equalsIgnoreCase(method)){
//            String serverInfo=request.getServletContext().getServerInfo();
//            String versionStr=serverInfo.substring(serverInfo.indexOf("/")+1,serverInfo.indexOf(".")+1);
//            if (Integer.parseInt(versionStr)<8){
//
//                HttpServletRequest myRequest = new MyWapper(request);
//                chain.doFilter(myRequest, response);
//                return;
//            }
//        }
//
//        chain.doFilter(request,response);
//    }
//
//    class MyWapper extends HttpServletRequestWrapper{
//
//        private  HttpServletRequest request;
//
//        public MyWapper(HttpServletRequest request) {
//            super(request);
//            this.request=request;
//        }
//
//        @Override
//        public String getParameter(String name) {
//            String value = request.getParameter(name);
//            if (value != null && !"".equals(value.trim())) {
//
//                try {
//                    value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
//
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                }
//            }
//            return value;
//        }
//
//    }
//
//}
//
