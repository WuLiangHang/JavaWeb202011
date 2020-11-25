<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--定义当前页面为错误信息页，作用：可以在当前页面直接使用JSP exception内置对象--%>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>服务器内部出错</title>
</head>
<body>
<h1>服务器内部报错啦。请联系我们的工作人员。</h1>
<img src="img/500.jpg">
<%=exception.getMessage()%>
</body>
</html>
