<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/23
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%!
        int a = 1;
        int b = 2;
    %>
    <%!
        public String print() {
            String str = "I hate JSP";
            return str;
        }
    %>
    <title>演示不同JSP脚本</title>
</head>
<body>
<%
    out.println("这是JSP代码块打印的: " + (a + b));//输出两个变量的和
%>
<%="这是JSP输出脚本打印的：" + (a + b)%>
<%
    out.println("这是JSP代码块打印的: " + print());
%>
<%="这是JSP输出脚本打印的：" + print()%>
<!--这是HTML注释-->
<%--"这是JSP注释"--%>
</body>
</html>
