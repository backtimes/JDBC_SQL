package com.xxxx.controller;

import com.xxxx.entity.vo.MessageModel;
import com.xxxx.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();
    private Object MessageModel;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //1.接受请求
        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        //2.调用service层的方法
        MessageModel messageModel=userService.userLogin(uname,upwd);
        //3.消息模型
        if (messageModel.getCode() == 1){
            request.getSession().setAttribute("user",messageModel.getObject());

            request.getSession().setAttribute("login_flag","123");

            response.sendRedirect(request.getContextPath() +"/private/index.jsp");
            return;
        }else{
            //
            request.setAttribute("messageModel",MessageModel);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}
