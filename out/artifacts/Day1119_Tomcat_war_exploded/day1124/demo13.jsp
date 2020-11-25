<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
//    for (Map.Entry<String, Object> entry :
//            map.entrySet()) {
//    }
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="entry">
    <h1>${entry.key} = ${entry.value}</h1>
</c:forEach>
</body>
</html>
