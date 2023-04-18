<%--
  Created by IntelliJ IDEA.
  User: Dream
  Date: 2022/10/20
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.xxxx.entity.User" %>
<jsp:useBean id="user2" class="com.xxxx.entity.User"  scope="page" />

<jsp:setProperty name="user2" property="userId" value="2" />
<jsp:setProperty name="user2" property="userName" value="李四" />
<jsp:setProperty name="user2" property="userAge" value="21" />

<%
     User user1=new User();
     user1.setUserId(1);
     user1.setUserName("张三");
     user1.setUserAge(20);
%>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h2>欢迎${user.userName}登陆成功</h2>
  <br>
  <hr>
 <div>
     <h3>用户Id：  <%= user1.getUserId()%> </h3>
     <h3>用户姓名：<%= user1.getUserName()%></h3>
     <h3>用户年龄：<%= user1.getUserAge()%> 岁</h3>
 </div>

 <br>
 <hr>
 <div>
     <h3>用户Id：  <jsp:getProperty name="user2" property="userId"/> </h3>
     <h3>用户姓名： <jsp:getProperty name="user2" property="userName"/></h3>
     <h3>用户年龄： <jsp:getProperty name="user2" property="userAge"/> 岁</h3>
 </div>

 <br>
 <hr>
 <div>
     <h3>用户Id：  3 </h3>
     <h3>用户姓名：${user.userName} </h3>
     <h3>密码：${user.userPwd}  </h3>
 </div>

 <br>
 <hr>
 <div>
     <h3>用户Id：  4 </h3>
     <h3>用户姓名：<%=request.getParameter("uname")%> </h3>
     <h3>密码：   <%=request.getParameter("upwd")%>   </h3>
 </div>



  </body>
</html>
