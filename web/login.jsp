<%--
  Created by IntelliJ IDEA.
  User: Dream
  Date: 2022/10/8
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>用户登录</title>
</head>
<body>
<div style="text-align: center">
    <form action="${pageContext.request.contextPath}/login" method="post" id="loginForm">
           姓名:<input type="text"     name="uname" id="uname" value="${messageModel.object.userName}"><br>
           密码:<input type="password" name="upwd" id="upwd"   value="${messageModel.object.userPwd}"><br>
           <span id="msg" style="font-size: 12px;color: red"> ${messageModel.msg}</span><br>
           <button type="button" id="loginBtn">登录</button>
           <button type="button">注册</button>
    </form>
</div>

</body>
<%--引入jQuery的js文件--%>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    /**
     *
     */

    $("#loginBtn").click(
        function (){
            //获取用户姓名和密码的值
            let uname = $("#uname").val();
            let upwd = $("#upwd").val();

            //判断姓名是否为空
            if (isEmpty(uname)){
                $("#msg").html("用户名不能为空!");
                return;
            }
            //判断密码是否为空
            if (isEmpty(upwd)){
                $("#msg").html("密码不能为空!");
                return;
            }
            //如果都不为空
            $("#loginForm").submit();
        });

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @returns {boolean}
     */
    function isEmpty(str){
        if (str==null||str.trim()==""){
            return true;
        }
        return false;
    }


</script>


</html>
