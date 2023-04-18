package com.xxxx.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/online")
public class onlineServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //创建session
        HttpSession session=req.getSession();

        String key=req.getParameter("key");
        if(key!=null&&"logout".equals(key)){

            //销毁session对象
            session.invalidate();
            return;
        }

        /**
         * 登录操作
         */
        //得到当前作用域的在线人数
        Integer onlineNumber =(Integer) session.getServletContext().getAttribute("onlineNumber");

        //设置响应类型及编码
        resp.setContentType("text/html;charset=UTF-8");

        //输出人数
        resp.getWriter().write("<h3>当前在线人数:"+onlineNumber+"</h3>  <a  color='red' href='online?key=logout'>退出</a>");
    }
}
