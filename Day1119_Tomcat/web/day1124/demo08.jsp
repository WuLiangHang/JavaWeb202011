<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--//使用taglib指令引入标签库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--set标签 可以往域中保存数据--%>
<%--
<c:set/>
较少使用
作用：可以往域中保存数据
域对象.setAttribute(key, value);
scope 属性 设置保存到哪个域
var 属性设置 key 是多少
value 设置属性值是多少
--%>
<c:set scope="session" var="abc" value="abcValue" />
保存之后:${sessionScope.abc}
</body>
</html>
