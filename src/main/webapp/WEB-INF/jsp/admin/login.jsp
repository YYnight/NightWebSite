<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/15
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>夭夜の博客后台登录</title>
    <link rel="stylesheet" href="/static/css/admin/login.css"/>
    <script src="/static/js/admin/login.js"></script>
</head>
<body>
<%@include file="bg.jsp"%>
    <div class="form_bg" data-scroll-reveal="enter top 0.5s">
    <div class="center_content" data-scroll-reveal="wait 0.5s then enter right 0.3s">
        <div class="login_title">
            <h2>用户登录</h2>
            <div class="error_message">${error}</div>
        </div>
        <div class="login_form">
            <form action="/admin/login" method="post" onsubmit="return checkForm()">
        <p class="username_p">
            <span class="u_logo"></span>
            <input id="username" name="username" class="ipt" type="text" placeholder="请输入用户名">
        </p>
        <p class="password_p">
            <span class="p_logo"></span>
            <input type="password" id="password" name="password" class="ipt" placeholder="请输入密码">
        </p>
        <div>
            <input type="submit" value="登录" class="ipt btn_submit">
        </div>
            </form>
        </div>
        </div>

    </div>
    </div>
<script>
    if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
        (function(){
            window.scrollReveal = new scrollReveal({reset: true});
        })();
    };
</script>
</body>
</html>
