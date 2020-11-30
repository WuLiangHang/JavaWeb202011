<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/28
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${empty sessionScope.user}">
        您还没有登录
    </c:when>
    <c:otherwise>
        用户名:${sessionScope.user.username}
        <hr/>
        <table>
            <tr>
                <th>用户名</th>
                <th>IP地址</th>
                <th>登录时间</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${onlineUsers}" var="entry">
                <tr>
                    <td>${entry.value.username}</td>
                    <td>${entry.value.ip}</td>
                    <td>${entry.value.logintime}</td>
                    <td></td>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>
