<%@ page import="com.charge.entity.ChargeInfo" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>话费缴存</title>
</head>
<body>
<%
    ChargeInfo chargeInfo = (ChargeInfo) request.getAttribute("chargeInfo");
%>
<table align="center" border="1px solid black" width="80%" style="text-align: center">
    <tr>
        <td><h1>话费自助缴存</h1></td>
    </tr>
    <form action="/ebank/charge" >
        <tr>
            <td>电话号码:<input type="text" name="phone" value="<%=chargeInfo.getUserId()%>" readonly/>
            </td>
        </tr>
        <%
            if (chargeInfo.getIsPay() == 0) {//欠费
        %>
        <tr>
            <td>
                应缴话费:<%=chargeInfo.getCharge()%>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit">缴费</button>
            </td>
        </tr>
        <%
        } else if (chargeInfo.getIsPay() == 1) {//不欠费
        %>
        <tr>
            <td>
                您已经缴纳了本月的话费，<a href="/searchInfo.jsp">返回首页</a>
            </td>
        </tr>
        <%
            }
        %>
    </form>
</table>
</body>
</html>
