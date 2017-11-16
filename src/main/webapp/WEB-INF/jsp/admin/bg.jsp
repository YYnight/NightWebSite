<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/15
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="/static/framework/jquery-2.1.4/jquery.min.js"></script>
    <script src="/static/framework/jquery-2.1.4/scrollReveal.js"></script>
    <script src="/static/framework/jquery-2.1.4/Particleground.js"></script>
    <link rel="stylesheet" href="/static/css/admin/base.css"/>
    <script>
        $().ready(function(){
//            $('#particles').particleground();
            $('#particles').particleground({
                dotColor:'#ff0000',
                lineColor:'#ff0000'
            })
        })
    </script>
</head>
<div id="particles" style="z-index:-2;width: 100%;height: 100%;position:fixed;"></div>
<div class="header">
    <div class="logo" data-scroll-reveal="enter left 1s"><img src="/static/images/logo.png"/> <span>只有更强，才能掌握自己的命运....</span></div>
    <div class="weather">
        <iframe name="weather_inc" src="http://i.tianqi.com/index.php?c=code&id=3" width="160" height="70" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
    </div>
</div>