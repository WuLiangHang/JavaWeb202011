<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>404！找不到该资源</h1>
<img src="img/404.jpg">
<%=exception.getMessage()%>
</body>
</html>
