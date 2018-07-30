<%--
  Created by IntelliJ IDEA.
  User: fujia
  Date: 2016/3/30
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加学生信息</title>
</head>
<body>
<form action="${website}Book/new" method="post">
    bookname<input name="bookname" type="text" /><br><br>
    author:<input name="author" type="text" /><br><br>
    introduction:<input name="introduction" type="text"/><br><br>
    country:<input name="country" type="text"/><br><br>
    publisher:<input name="publisher" type="text"/><br><br>
    <input type="submit" value="提交"/><br>
</form>
</body>
</html>
