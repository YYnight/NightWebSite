<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/13
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/message.css"/>
</head>
<body>
    <%@include file="../base.jsp"%>
    <div class="container">
        <div id="fountainG">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </div>
        <div class="about_boy">
            <span><a href="/"><img src="/upload/images/studio_0001.jpg" alt=""></a></span>
            <p>"当您驻足停留过，从此便注定我们的缘分。站在时间的尽头，我们已是朋友，前端的路上我再也不用一个人独自行走。"</p>
        </div>
        <div class="gbko">
            <div id="SOHUCS" sid="[!--id--]">
                <div node-type="cy-collection-btn" class="cy-collection-btn"><i></i><span>收藏文章</span></div>
                <div class="moduce-cmt-header">
                    <div class="cy-hidden"><button id="jump-to-kz"></button></div>
                    <div class="clear-g section-title-w">
                        <div class="title-user-w">
                            <div node-type="user" class="clear-g user-wrap-w">
                                <span node-type="user-name" class="wrap-name-w"></span>
                            </div>
                        </div>
                    </div>
                    <div class="section-cbox-w">
                        <div node-type="block-head-w" class="block-head-w">
                            <div node-type="avatar" class="head-img-w">
                                <a href="javascript:void(0);">
                                    <img node-type="user-head" src="https://changyan.sohu.com/upload/asset/scs/images/pic/pic42_null.gif" width="42" height="42">
                                    <div node-type="head-img-ie-mask" class="head-img-ie-mask"></div>
                                </a>
                                <div node-type="notice-node" style="display:none" class="cy-avatar-notice-node"></div>
                            </div>
                            <div node-type="header-login" class="header-login">登录</div>
                            <div class="cy-to-shequ-head">
                                <span>我的社区</span>
                            </div>
                            <div node-type="cy-hot-words" class="cy-hot-words"></div>
                        </div>
                    </div>
                    <div node-type="login-select" class="block-post-w">
                        <%--放置cbox初始状态--%>
                        <div class="module-cmt-box">
                            <%--展开状态--%>
                            <div class="post-wrap-w">
                                <div class="post-wrap-border-l"></div>
                                <div class="post-wrap-border-r"></div>
                                <div node-type="post-wrap-main" class="post-wrap-main">
                                    <div class="post-wrap-border-t">
                                        <div node-type="post-wrap-border-t-l" class="post-wrap-border-l"></div>
                                        <div node-type="post-wrap-border-t-r" class="post-wrap-border-r"></div>
                                    </div>
                                    <div class="wrap-area-w">
                                        <div class="area-textarea-w">
                                            <textarea nodetype="textarea" name class="textarea-fw textarea-bf">

                                            </textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="clear-g wrap-action-w">
                                    <div class="action-function-w">
                                        <ul class="clear-g">
                                            <li node-type="function-face" class="function-face-w">
                                                <a href="javascript:void(0);"><i class="face-b"></i></a>
                                            </li>
                                            <li node-type="function-uploading" class="function-uploading-w">
                                                <a href="javascript:void(0);" title="上传图片"><i class="uploading-b"></i></a>
                                                <div class="uploading-file-w"><a href="javascript:void(0);" name class="file-fw"></a></div>
                                                <form style="display:none;">
                                                    <input type="file" name="file" accept="image/jpg,image/jpeg,image/png">
                                                </form>
                                            </li>
                                        </ul>
                                        <div node-type="face"></div>
                                    </div>
                                    <div class="clear-g action-issue-w"></div>
                                    <div class="cbox-prompt-w" node-type="error-tips">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
