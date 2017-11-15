<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/9
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/log.css"/>
    <link rel="stylesheet" href="/static/css/aboutme.css"/>
    <script src="/static/js/log.js"></script>
</head>
<body>
    <%@include file="../base.jsp"%>
    <%--<div id="content" class="container-fluid">
        <div class="row-fluid">
            <div class="span10">2</div>
            <div class="span2">10</div>
        </div>
    </div>--%>
    <div class="con_content" data-scroll-reveal="enter top 0.5s">
        <div class="about_box">
            <h2 class="nh1">
                <span>
                    "您现在的位置是"
                    <a href="#">网站首页</a>">>"
                    <a href="#">日志浏览</a>
                </span>
                <b>个人日志</b>
            </h2>
        <div class="row">
            <div class="col-md-10">
                <div class="mod_summary" id="logContent">
                    <ul class="list-unstyled">
                        <c:forEach items="${logList}" var="log">
                        <li>
                            <div class="bor2 mod_article">
                                <div class="hd"><h4><a href="javascript:void(0);" onclick="findLogById(${log.id})">${log.title}</a></h4></div>
                                <div class="bd">
                                    <div class="txt_detail_info">
                                        ${log.summary}
                                    </div>
                                </div>
                                <div class="ft">
                                    <span class="c_tx3 pub_time">2011-12-10</span>
                                    <span>阅读(<span>${log.readedNum}</span>)</span>
                                    <span class="c_tx3">评论(${log.commentNum})</span>
                                </div>
                            </div>
                        </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="col-md-2 span2">
                <%@include file="rightcontent.jsp"%>
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
