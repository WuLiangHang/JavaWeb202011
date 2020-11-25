<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询话费</title>
    <script type="text/javascript">
        function check() {
            let phone = document.getElementById("phone").value;
            if (!phone) {
                alert("电话号码不能为空！");
                return false;
            }
        }
    </script>

</head>
<body>
<%
    String message = (String) request.getAttribute("message");
    if (null != message) {%>
<%=message%>
<% }
%>
<table align="center" border="1px solid black" width="80%" style="text-align: center">
    <tr>
        <td><h1>话费自助缴存</h1></td>
    </tr>
    <form action="/ebank/queryPhone" onsubmit="return check();">
        <tr>
            <td>电话号码:<input type="text" name="phone" id="phone"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">查询</button>
            </td>
        </tr>
    </form>
</table>
</body>
</html>
