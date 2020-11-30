package com.servlet;

import com.bean.Person;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo02")
public class Demo02Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action.equals("jQueryAjax")){
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
}
