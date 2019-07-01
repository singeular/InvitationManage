<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: singe
  Date: 2019/6/14
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Date nowDate = new Date(); request.setAttribute("nowDate", nowDate); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addB/${invid}" method="post">
    <table border="1">
        <tr>
            <td align="center" colspan="2">
                添加回复
            </td>
            <input type="hidden" name="invid" value="${invid}">
        </tr>
        <tr>
            <td align="center">回复内容</td>
            <td>
                <textarea name="content"></textarea>
            </td>
        </tr>
        <tr>
            <td align="center">回复昵称</td>
            <td>
                <input type="text" name="author">
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" value="提交">
                <a href="jsp/replyList.jsp"><input type="button" value="返回"></a>
            </td>
         </tr>
    </table>
</form>
</body>
</html>
