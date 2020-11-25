package com.dfrz.day1120;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ContextServlet3")
public class ContextServlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("在保存之后 ContextServlet2 当中 name = studentName 的 value为 ：" + getServletContext().getAttribute("studentName"));
    }
}
