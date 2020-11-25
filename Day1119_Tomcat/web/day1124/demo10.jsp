<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:choose> <c:when> <c:otherwise>
choose标签 开始选择判断
when标签 表示每一种判断情况
test属性 表示当前这种判断的值
otherwise 表示剩下的情况
--%>
<% request.setAttribute("height", 180); %>
<c:choose>
    <%--    EL表达式作为test属性值时：1.要将判断条件都写在{}--%>
    <%--    2.EL表达式外 不能有空格--%>
    <c:when test="${requestScope.height > 190}">
        <h2>身高 > 190</h2>
    </c:when>
    <c:when test="${requestScope.height > 180}">
        <h2>身高 > 180</h2>
    </c:when>
    <c:when test="${requestScope.height > 170}">
        <h2>身高 > 170</h2>
    </c:when>
    <c:otherwise>
        <h2>其他</h2>
    </c:otherwise>
</c:choose>
</body>
</html>
