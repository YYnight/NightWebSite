<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/15
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>夭夜の博客后台登录</title>
    <link rel="stylesheet" href="/static/css/admin/login.css"/>
    <script src="/static/js/admin/login.js"></script>
</head>
<body>
<%@include file="bg.jsp"%>
<form action="" method="post" onsubmit="return checkForm()">
    <div class="center_content">
        <p class="username_p">
            <span class="u_logo"></span>
            <input id="username" name="username" class="ipt" type="text" placeholder="请输入用户名">
        </p>
        <p class="password_p">
            <span class="p_logo"></span>
            <input type="password" id="password" name="password" class="ipt" placeholder="请输入密码">
        </p>
        <div>

        </div>
    </div>
</form>
<script>
    if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
        (function(){
            window.scrollReveal = new scrollReveal({reset: true});
        })();
    };
</script>
</body>
</html>
