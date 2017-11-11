<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/10
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="logcategorys block">
    <div class="hd block">
        <span class="h5">日志分类</span>
        <div class="pull-right">
            <a class="text-info">管理</a>
        </div>
    </div>
    <div class="text-info bd block">
        <ul class="list-unstyled">
            <li><a href="javascript:void(0);" onclick="findLogsByLogTypeId()"><span class="pull-left"></span>全部日志<span class="pull-right">(${logList.size()})</span></a></li>
            <c:forEach items="${logTypeList}" var="logType">
                <li><a href="javascript:void(0);" onclick="findLogsByLogTypeId(${logType.id})"><span class="pull-left"></span>${logType.typeName}<span class="pull-right">(${logType.blogCount})</span></a></li>
            </c:forEach>
        </ul>
    </div>
</div>
<hr class="text-info"/>
<div class="search block">
    <h5>搜索日志</h5>
    <div class="input-group input-group-sm">
        <input type="text" id="keyWord" class="form-control" placeholder="Search for...">
        <span class="input-group-btn">
            <button class="btn btn-default btn-sm" type="button" onclick="searchByKeyword()">搜索</button>
        </span>
    </div>
</div>
<hr/>
<div class="box_calendar" id="calendarArea">
    <div class="bg2 bor2 calendar_year">
        <a class="c_tx glyphicon glyphicon-triangle-left" href="javascript:;"></a>
        <strong class="year">2017年</strong>
        <a class="c_tx arr_pre glyphicon glyphicon-triangle-right" href="javascript:void(0);"></a>
    </div>
    <ul class="list-unstyled calendar_month lbor2">
        <li class="bor2" data-toggle="tooltip" data-placement="bottom" title="0"><span class="c_tx2">1月</span></li>
        <li class="bor2"><span class="c_tx2">2月</span></li>
        <li class="bor2"><span class="c_tx2">3月</span></li>
        <li class="bor2"><span class="c_tx2">4月</span></li>
        <li class="bor2"><span class="c_tx2">5月</span></li>
        <li class="bor2"><span class="c_tx2">6月</span></li>
        <li class="bor2"><span class="c_tx2">7月</span></li>
        <li class="bor2"><span class="c_tx2">8月</span></li>
        <li class="bor2"><span class="c_tx2">9月</span></li>
        <li class="bor2"><span class="c_tx2">10月</span></li>
        <li class="bor2"><span class="c_tx2">11月</span></li>
        <li class="bor2"><span class="c_tx2">12月</span></li>
    </ul>
</div>
