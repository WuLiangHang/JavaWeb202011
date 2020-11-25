<%@ page import="com.dfrz.day1123.demo01.User" %>
<%@ page import="java.util.List" %>
<%@page errorPage="error500.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@page autoFlush="true" buffer="8kb" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<User> users = (List<User>) request.getAttribute("users"); %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
欢迎访问userList.jsp，看到这个页面 说明Tomcat整合IDEA成功。
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>用户名</td>
    </tr>
    </thead>
    <tbody>
    <% for (int i = 0; i < users.size(); i++) {
        User user = users.get(i);
    %>
    <tr>
        <td><%=user.getId()%>
        </td>
        <td><%=user.getUsername()%>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>
