<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/9
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Photo</title>

    <link rel="stylesheet" href="/static/css/main.css">
    <link rel="stylesheet" href="/static/css/base.css">
    <link rel="stylesheet" href="/static/framework/font-awesome-4.7.0/font-awesome-4.7.0/css/font-awesome.min.css"/>
    <script src="/static/framework/jquery-2.1.4/jquery.min.js"></script>
    <script src="/static/framework/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="/static/framework/jquery-2.1.4/Particleground.js"></script>
    <script src="/static/framework/jquery-2.1.4/scrollReveal.js"></script>
    <link rel="stylesheet" href="/static/framework/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script src="/static/js/utils.js"></script>
    <script type="text/javascript">
        $(function(){
            $('#particles').particleground();
            $('#particles').particleground({
                dotcolor:'#ff0000',
                lineColor:'#ff0000'
            })
            $(".mask").css("height",$(window).height())
            wordLimit('.art_summary',100);
            var timer = null;
            var right = $($(".photo-menu").find("a")[0]).css("right").slice(0,-2);
            $(".photo-menu").mouseenter(function(){
                clearTimeout(timer);
                var that= $(this);
                timer = setTimeout(function(){
                    that.find("a").each(function(index,ele){
                        setTimeout(function(){
                            $(ele).stop().animate({right:0},200);
                        },50*index);
                    })
                },200)
            }).mouseleave(function(){
                if(timer){
                    clearTimeout(timer);
                    $(this).find("a").each(function(index,ele){
                        setTimeout(function(){
                            $(ele).stop().animate({right:right},200);
                        },50*index)
                    })
                }
            })
        })
    </script>
</head>
<body>
<div id="particles" style="z-index:-2;width: 100%;height: 100%;position:fixed;"></div>
<div class="header">
    <div class="logo" data-scroll-reveal="enter left 1s"><img src="/static/images/logo.png"/> <span>只有更强，才能掌握自己的命运....</span></div>
        <div class="weather">
            <iframe name="weather_inc" src="http://i.tianqi.com/index.php?c=code&id=3" width="160" height="70" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
        </div>
</div>
<%--<div class="wrapPhoto"></div>--%>
<div class="photo-menu">
    <a class="wrapMenu Menu1" href="<c:url value="/index"/>"><i class="fa fa-home" aria-hidden="true"></i>主页</a>
    <a class="wrapMenu Menu2" href="<c:url value="/aboutme"/>"><i class="fa fa-user-o" aria-hidden="true"></i>个人信息</a>
    <a class="wrapMenu Menu3" href="<c:url value="/log"/>"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>日志</a>
    <a class="wrapMenu Menu4" href="<c:url value="/photo"/>"><i class="fa fa-picture-o" aria-hidden="true"></i>图片</a>
    <a class="wrapMenu Menu5"><i class="fa fa-file-text-o" aria-hidden="true"></i>文章</a>
    <a class="wrapMenu Menu6"><i class="fa fa-pencil" aria-hidden="true"></i>笔记</a>
    <a class="wrapMenu Menu7"><i class="fa fa-music" aria-hidden="true"></i>音乐</a>
    <a class="wrapMenu Menu8" href="/tellme"><i class="fa fa-video-camera" aria-hidden="true"></i>留言</a>
</div>
<%--<div id="footer" class="footer">
    <a class="menu fa fa-home" aria-hidden="true"></a>
    <a class="menu fa fa-user-o" aria-hidden="true"></a>
    <a class="menu fa fa-pencil-square-o" aria-hidden="true"></a>
    <a class="menu fa fa-pencil" aria-hidden="true"></a>
    <a class="menu fa fa-file-text-o" aria-hidden="true"></a>
    <a class="menu fa fa-music" aria-hidden="true" href="https://y.qq.com/portal/player.html"></a>
    <a class="menu fa fa-picture-o" aria-hidden="true"></a>
    <a class="menu fa fa-video-camera" aria-hidden="true"></a>
</div>--%>
<a class="bshareDiv" href="http://www.bshare.cn/share">分享按钮</a><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#uuid=&amp;style=5&amp;fs=4&amp;bgcolor=Purple"></script>
</body>
</html>