<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 终老。
  Date: 2018/7/28
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin-top:180px;background-color: rgba(0,0,0,0.3)" align="center">
    <table border="0" style="color: white">
        <form action="/Book/search" method="post">
            <tr><input type="test" name="sname"><input type="submit" value="提交"></tr>
        </form>
        <tr><td>序号</td><td>书籍名称</td><td>作者</td><td>作者国籍</td><td>操作</td></tr>
        <%--这是什么？？var varStatus--%>
        <c:forEach items="${list}" var="book" varStatus="status">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookname}</td>
                <td>${book.author}</td>
                <td>${book.country}</td>
                <td>
                    <a href="/BookSevlet?state=showallinf&id=${book.id}"><button>查看</button></a>
                        <%--<c:if test="${bookpublisher==currentuser}"><a href="/BookSevlet?state=alter&id=${book.id}"><button class="but">修改</button></a></c:if>--%>
                        <a href="/Book/del?id=${book.id}"><button class="but">删除</button></a>
                        <a href="/Book/toupdate?id=${book.id}"><button class="but">修改</button></a>

                        <%--<a href="/BookSevlet?state=delbook&id=${book.id}"><button class="but">删除</button></a>--%>

                </td>
            </tr>
        </c:forEach>
        <tr><td><a href="/Book/toadd"><button>添加</button></a></td></tr>
    </table>
</div>
</body>
</html>
