<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/28
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<p style="font-weight: 900;color: red">${msg}</p>
<form action="UserServlet">
    <input type="hidden" name="method" value="login"/>
    用户名:<input type="text" name="username"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
