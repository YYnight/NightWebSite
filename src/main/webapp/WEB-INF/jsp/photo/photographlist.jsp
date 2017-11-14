<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/14
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图片</title>
    <link rel="stylesheet" href="/static/css/photos.css">
    <script src="/static/js/photo.js"></script>
    <%--<script>--%>
        <%--$(function(){--%>
            <%--alert($(window).height())--%>
            <%--$(".mask").addClass("height:"+$(window).height())--%>
        <%--})--%>
    <%--</script>--%>
</head>
<body>
    <%@include file="../base.jsp"%>
    <div class="container">
        <ul>
        <c:forEach items="${photographList}" var="photograph">
            <li><div onclick="showImage('${photograph.path}')"><img src="/${photograph.path}"><span class="info"><p>${photograph.uploadDate}</p>${photograph.imageName}</span></div></li>
        </c:forEach>
        </ul>
    </div>
    <div class="mask">
        <div class="maskContent">

            <div class="neirong" onclick="openMask()">打开</div>
            <div class="close" onclick="closeMask()">X</div>
        </div>
    </div>
</body>
</html>
