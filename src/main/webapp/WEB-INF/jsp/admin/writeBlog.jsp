<%--
  Created by IntelliJ IDEA.
  User: cr
  Date: 2017/11/16
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/framework/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" src="/static/framework/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="UTF-8" src="/static/framework/ueditor/lang/zh-cn.js"></script>
</head>
<body style="margin: 10px">
    <div id="p" class="easyui-panel" title="编写日志" style="padding: 10px;">
        <table  cellpadding="20px">
            <tr>
                <td width="80px">日志标题：</td>
                <td><input type="text" id="title" name="title" style="width: 400px;"></td>
            </tr>
            <tr>
                <td>所属类别：</td>
                <td>
                    <select name="logType.id" id="logTypeId" class="easyui-combobox" editable="false" panelHeight="auto" style="width: 154px;">
                        <option value="">请选择日志类型...</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td valign="top">日志内容：</td>
                <td>
                    <script id="editor" type="text/plain" style="width:100%; height: 500px;"></script>
                </td>
            </tr>
                <tr>
                <td>关键字：</td>
                <td><input type="text" id="keyWord" name="keyWord" style="width: 400px;"/>&nbsp;(多个关键字中间用空格隔开)</td>
            </tr>
            <tr>
                <td></td>
                <td>
                <a href="javascript:submitData()" class="easyui-linkbutton" data-options="iconCls:'icon-submit'">发布博客</a>
                /td>
            </tr>
        </table>
    </div>
                    <script type="text/javascript">//实例化编辑器
                //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
                var ue = UE.getEditor('editor');

                    </script>
</body>
</html>
