package com.dfrz.day1120;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ContextServlet2")
public class ContextServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext context = getServletContext();
        System.out.println("在保存之前 ContextServlet2 当中 name = studentName 的 value为 ：" + context.getAttribute("studentName"));
        context.setAttribute("studentName","张三");
        System.out.println("在保存之后 ContextServlet2 当中 name = studentName 的 value为 ：" + context.getAttribute("studentName"));

    }
}
