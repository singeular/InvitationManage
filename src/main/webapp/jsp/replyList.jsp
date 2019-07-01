<%--
  Created by IntelliJ IDEA.
  User: singe
  Date: 2019/6/14
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>贴吧</title>
    <script type="text/javascript">
    </script>
</head>

<body>
<table border="1" width="60%">
    <thead>
    <tr>
        <td colspan="4">
            <h1 align="center">回复信息列表</h1>
        </td>
    </tr>

    </thead>
    <tbody>
    <tr>
        <td colspan="4" align="center">
            <a href="/addA/${invid}">添加回复</a>
            <a href="/selectAll">返回帖子列表</a>
        </td>
    </tr>
    <tr>
        <td align="center">回复内容</td>
        <td align="center">回复昵称</td>
        <td align="center">发布时间</td>
    </tr>
    <c:forEach items="${replyList.list}" var="inv">

        <tr>
            <input type="hidden" value="${invid}">
            <td align="center">${inv.content}</td>
            <td align="center">${inv.author}</td>
            <td align="center">${inv.createdate}</td>

        </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
        <td colspan="4" align="center">
            <span>第${replyList.pageNum}页/共${replyList.pages}页</span>
            <a href="/selectB/${id}?PageIndex=1">首页</a>
            <a href="/selectB/${id}?PageIndex=${replyList.pageNum==1?1:replyList.prePage}">上一页</a>
            <a href="/selectB/${id}?PageIndex=${replyList.pageNum==replyList.pages?replyList.pages:replyList.nextPage}">下一页</a>
            <a href="/selectB/${id}?PageIndex=${replyList.pages}">尾页</a>
        </td>
    </tr>
    </tfoot>
</table>

</body>
</html>
