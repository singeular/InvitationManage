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
        <td colspan="5">
            <h1 align="center">帖子列表</h1>
        </td>
    </tr>

    </thead>
    <tbody>
    <tr>
        <td colspan="5" align="center">
            <form action="/selectBy">
                帖子标题：<input type="text" name="title">
                <input type="submit" value="搜索">
            </form>
        </td>
    </tr>
    <tr>
        <td align="center">标题</td>
        <td align="center">内容摘要</td>
        <td align="center">作者</td>
        <td align="center">发布时间</td>
        <td align="center">操作</td>
    </tr>
    <c:forEach items="${iPageInfo.list}" var="invi">

        <tr>
            <td align="center">${invi.title}</td>
            <td align="center">${invi.summary}</td>
            <td align="center">${invi.author}</td>
            <td align="center">${invi.creatdate}</td>
            <td align="center"><a href="/selectB/${invi.id}">查看回复</a>  ||  <a href="/deleteD/${invi.id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot>
        <tr>
            <td colspan="5" align="center">
                <span>第${iPageInfo.pageNum}页/共${iPageInfo.pages}页</span>
                <a href="/selectAll??PageIndex=1">首页</a>
                <a href="/selectAll?PageIndex=${iPageInfo.pageNum==1?1:iPageInfo.prePage}">上一页</a>
                <a href="/selectAll?PageIndex=${iPageInfo.pageNum==iPageInfo.pages?iPageInfo.pages:iPageInfo.nextPage}">下一页</a>
                <a href="/selectAll?PageIndex=${iPageInfo.pages}">尾页</a>
            </td>
        </tr>
    </tfoot>
</table>

</body>
</html>
