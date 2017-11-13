<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/13
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的相册</title>
    <link rel="stylesheet" href="/static/css/photos.css"/>
</head>
<body>
    <%@include file="../base.jsp"%>
    <div class="container">
        <div class="albums">
            <c:forEach items="${photoList}" var="photo">
            <div class="albums-inner">
                <div class="albums-tab photo-anim " id="photo-anim1">
                    <c:forEach items="${photo.photographs}" var="image">
                        <img src="${image.path}" class="image">
                    </c:forEach>
                </div>
                <div class="albums-tab-text">${photo.name}<span>(${photo.photographs.size()}pictures)</span></div>
            </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
