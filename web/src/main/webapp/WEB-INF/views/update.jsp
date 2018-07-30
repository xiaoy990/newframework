<%--
  Created by IntelliJ IDEA.
  User: fujia
  Date: 2016/3/21
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/Book/update?id=<%=request.getParameter("id")%>" method="post">
    <input type="text" name="bookname" placeholder="书名">
    <input type="text" name="author" placeholder="作者">
    <input type="text" name="country" placeholder="国家">
    <input type="text" name="introduction" placeholder="简介">
    <input type="submit" value="确定">
</form>
</body>
</html>
