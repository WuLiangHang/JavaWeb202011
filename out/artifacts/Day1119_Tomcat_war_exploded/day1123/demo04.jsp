<%@ page import="com.dfrz.day1123.demo02.User" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP bean相关动作标签</title>
</head>
<body>
<%
    User user = new User();
    pageContext.setAttribute("user", user);
    out.println(pageContext.getAttribute("user"));
%>

<jsp:useBean id="user1" class="com.dfrz.day1123.demo02.User"/>
<%=user1%>

<%--对user1对象进行赋值--%>
<jsp:setProperty name="user1" property="username" value="admin"/>
<jsp:setProperty name="user1" property="password" value="123"/>
<%--对user1对象进行取值--%>
用户名：<jsp:getProperty name="user1" property="username"/><br>
密码:<jsp:getProperty name="user1" property="password"/><br>
<%--<%--%>
<%--    User user1 = (User) application.getAttribute("user1");--%>
<%--    if (user1 == null) {--%>
<%--        user1 = new User();--%>
<%--        application.setAttribute("user1", user1);--%>
<%--    }--%>
<%--%>--%>


</body>
</html>
