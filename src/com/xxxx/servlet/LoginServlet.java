//package com.xxxx.servlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//
//
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("用户登录....");
//        String uname=req.getParameter("uname");
//        System.out.println("uname");
//
//        if ("admin".equals(uname)){
//            req.getSession().setAttribute("user",uname);
//            resp.sendRedirect("index.jsp");
//        }else {
//            req.getRequestDispatcher("login.jsp").forward(req,resp);
//        }
//    }
//}
