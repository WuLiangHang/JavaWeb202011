<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/26
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form method="get" action="/Day1119/day1126/login">
    用户名:<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    验证码:<img src="/Day1119/kaptcha.jpg" style="width: 100px;height: 30px"/>
    验证码输入:<input type="text" name="code"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
