package com.servlet;

import com.bean.Person;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo01")
public class Demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //JavaBean和json的互转
        Person person = new Person(1, 15, "小刚", 'F');
        //创建Gson对象实例
        Gson gson = new Gson();
        //把person对象 转成JSON字符串
        String personJSONStr = gson.toJson(person);
        System.out.println(personJSONStr);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(personJSONStr);
    }
}
