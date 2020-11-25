<%@ page import="com.dfrz.day1124.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("张三");
    person.setPhones(new String[]{"123456", "456789", "123456789"});
    List<String> cities = new ArrayList<>();
    cities.add("北京");
    cities.add("上海");
    cities.add("广州");
    cities.add("深圳");
    person.setCities(cities);
    Map<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    person.setMap(map);
    pageContext.setAttribute("p", person);
%>
<%--.和[]区别--%>
<%--1. .可以输出bean对象中某个属性的值--%>
<%--2. []可以输出有序集合中某个元素的值--%>
输出Person: ${p} <br/>
输出Person的name属性: ${p.name} <br/>
输出Person的phones数组属性值: ${p.phones[1]} <br/>
输出Person的cities集合中元素值: ${p.cities} <br/>
输出Person的cities集合中某个元素值: ${p.cities[2]} <br/>
输出Person的map集合: ${p.map} <br/>
输出Person的map集合某个key的值: ${p.map.key2} <br/>
</body>
</html>
