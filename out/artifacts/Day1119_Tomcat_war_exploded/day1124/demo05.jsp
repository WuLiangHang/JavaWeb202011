<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("emptyNull", null);
    request.setAttribute("emptyStr", "");
    request.setAttribute("emptyIntArr", new int[]{});
    //值是Object数组 长度为零时 为空
    request.setAttribute("emptyArr", new String[]{});
    request.setAttribute("emptyList", new ArrayList<>());
    request.setAttribute("emptyMap", new HashMap<>());
%>
${empty emptyNull}<br/>
${empty emptyStr}<br/>
${empty emptyIntArr}<br/>
${empty emptyArr}<br/>
${empty emptyList}<br/>
${empty emptyMap}<br/>
${2 > 1 ? "真":"假"}
</body>
</html>
