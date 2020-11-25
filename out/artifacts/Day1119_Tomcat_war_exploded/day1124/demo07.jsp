<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--pageContext对象使用--%>
<%
    request.getScheme();//可以获取请求协议
%>
<%
    pageContext.setAttribute("req", request);
%>
1.请求的协议:${req.scheme}<br/>
2.服务器名称：${pageContext.request.serverName}<br/>
3.服务器端口:${pageContext.request.serverPort}<br/>
4.获取工程路径:${pageContext.request.contextPath}<br/>
5.获取请求方法:${pageContext.request.method}<br/>
6.获取客户端IP地址:${pageContext.request.remoteHost}<br/>
7.获取会话的ID编号${pageContext.session.id}<br/>
</body>
</html>
