<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //往四个域中都保存了相同的key
//    pageContext.setAttribute("username", "张三");
//    request.setAttribute("username", "李四");
//    session.setAttribute("username", "王五");
    application.setAttribute("username", "赵六");
%>
<%--//EL表达式 按照四个域 从小到大的顺序去进行搜索--%>
${username}
</body>
</html>
