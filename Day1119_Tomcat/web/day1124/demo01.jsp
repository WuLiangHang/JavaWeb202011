<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo01</title>
</head>
<body>
<%
    request.setAttribute("username1", "admin");
%>
表达式输出username的值:
<%=request.getAttribute("username") == null ? "" : request.getAttribute("username")%>
<%--//EL表达式 按照四个域 从小到大的顺序去进行搜索--%>
EL表达式输出key的值是:${username}
</body>
</html>
