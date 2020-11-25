<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/25
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<div>
    <a href="/Day1119/day1125/GoodsServlet?name=toy"><img src="../img/day1125/toy.jpg"/> </a><br/>
    <font>玩具车</font>
</div>
<div>
    <a href="/Day1119/day1125/GoodsServlet?name=car"><img src="../img/day1125/car.jpg"/> </a><br/>
    <font>兰博基尼</font>
</div>
<div>
    <a href="/Day1119/day1125/GoodsServlet?name=grape"><img src="../img/day1125/grape.jpg"/> </a><br/>
    <font>葡萄</font>
</div>
<div>
    <a href="/Day1119/day1125/GoodsServlet?name=sausage"><img src="../img/day1125/sausage.jpg"/> </a><br/>
    <font>香肠</font>
</div>
<div>
    <a href="/Day1119/day1125/GoodsServlet?name=wash"><img src="../img/day1125/wash.jpg"/> </a><br/>
    <font>香水</font>
</div>
您浏览过的商品:
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c :
                cookies) {
            if ("goods".equals(c.getName())) {
                String value = c.getValue();
                String[] names = value.split("&");
%>
<table align="center" border="1px solid blue" width="500px">
    <%
        for (int i = 0; i < names.length; i++) {
    %>
    <tr>
        <td>
            <%=names[i]%>
        </td>
    </tr>

    <%
        }
    %>
</table>
<%
            }
        }
    }
%>
</body>
</html>
