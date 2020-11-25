<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:forEach>
    1.遍历1到10输出
    begin属性设置开始的索引
    end属性设置结束的索引
    var 属性表示循环的变量
--%>
<table border="1">
    <c:forEach begin="1" end="10" var="i">
        <tr>
                <%--//在foreach中 只能用EL表达式输出当前遍历的值--%>
            <td>第${i}行</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
