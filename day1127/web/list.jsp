<%@ page import="com.entity.User" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/27
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片列表</title>
</head>
<body>
<% List<User> users = (List<User>) request.getAttribute("users"); %>
<%--设置img的src属性 就可以让网页直接显示这张图片--%>
<%--<img src="/day1127/fileDownload"/>--%>
<table>
    <tr>
        <td>ID</td>
        <td>用户名</td>
        <td>密码</td>
        <td>头像</td>
    </tr>

    <%
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
    %>
    <tr>
        <td><%=user.getId()%>
        </td>
        <td><%=user.getUsername()%>
        </td>
        <td><%=user.getPassword()%>
        </td>
<%--        //金句：前端展示图片--%>
        <td><img src="/day1127/fileDownload?path=<%=URLEncoder.encode(user.getImgPath(),"UTF-8") %>"/>
        </td>

    </tr>
    <%
        }
    %>
</table>
</body>
</html>
