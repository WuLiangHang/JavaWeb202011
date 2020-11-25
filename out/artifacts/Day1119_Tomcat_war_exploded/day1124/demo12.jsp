<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
遍历object数组
items 表示遍历的数据源(遍历的集合)
--%>
<%
    request.setAttribute("arr", new String[]{"1", "2", "3", "4"});
%>
<c:forEach items="${requestScope.arr}" var="item">
    ${item}<br/>
</c:forEach>
</body>
</html>
