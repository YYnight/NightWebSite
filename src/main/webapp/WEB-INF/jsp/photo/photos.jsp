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
    <div class="con_content" data-scroll-reveal="enter top 0.5s">
        <div class="about_box">
            <h2 class="nh1">
                <span>
                    "您现在的位置是"
                    <a href="#">网站首页</a>">>"
                    <a href="#">相册浏览</a>
                </span>
                <b>个人相册</b>
            </h2>
        <div class="albums" data-scroll-reveal="wait 0.5s and enter top 1s">
            <c:forEach items="${photoList}" var="photo">
            <div class="albums-inner">
                <div class="albums-tab photo-anim " id="photo-anim1">
                    <c:forEach items="${photo.photographs}" var="image">
                        <img src="${image.path}" class="image">
                    </c:forEach>
                </div>
                <div class="albums-tab-text"><a href="<c:url value='/photograph/findByPhotoId?id=${photo.id}'/>">${photo.name}</a><span>(${photo.photographs.size()}pictures)</span></div>
            </div>
            </c:forEach>
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
