<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hel</h1>
<%--指令 静态包含 把两个页面的内容写到一个servlet中--%>
<%--<%@include file="lo.jsp"%>--%>
<%--包含动作 两个页面分别写到两个servlet中--%>
<%--<jsp:include page="lo.jsp"></jsp:include>--%>
<%--请求转发--%>
<%--<jsp:forward page="lo.jsp"></jsp:forward>--%>
<jsp:include page="lo.jsp">
    <%--    jsp:param 是include的子标签--%>
    <jsp:param name="username" value="zhangsan"/>
</jsp:include>
</body>
</html>
