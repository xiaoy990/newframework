<%--
  Created by IntelliJ IDEA.
  User: 终老。
  Date: 2018/7/31
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <% String path = request.getContextPath(); String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<html>
<head>

    <title>添加成功！</title>
</head>
<body>
<h1>Success!</h1>
<img src="${image.image}">
<p>${image.user}</p>
</body>
</html>
