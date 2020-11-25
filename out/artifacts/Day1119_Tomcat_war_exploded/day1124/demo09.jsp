<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    <c:if />
    if标签用来做if判断
    test属性（必须）:表示判断的条件 使用EL表达式
--%>
<c:if test="${1 == 1}">
    <h1>1等于1</h1>
</c:if>
<c:if test="${0 != 1}">
    <h1>0不等于1</h1>
</c:if>
</body>
</html>
