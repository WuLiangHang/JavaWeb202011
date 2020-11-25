<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% //要保证set和get在同一个作用域中
    pageContext.setAttribute("str", "JSP", PageContext.SESSION_SCOPE);
    String str = (String) pageContext.findAttribute("str");
//    String str = (String) pageContext.getAttribute("str", PageContext.PAGE_SCOPE);
    if (null == str) {
        out.write("str为空");
    } else {
        out.write(str);
    }
%>
</body>
</html>
