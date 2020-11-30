<%@ page import="com.dfrz.day1126.demo01.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/26
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        out.print("宁还没有登录");
    } else {
        out.print("用户名:" + user.getUsername());
    }
%>
<a href="/Day1119/day1126/logout">注销</a>
<a href="index2.jsp">跳转到下一个页面</a>
</body>
</html>
