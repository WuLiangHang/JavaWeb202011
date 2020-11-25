package com.dfrz.day1121.demo01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        getServletContext().setAttribute("count", 0);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //防止中文乱码
        response.setContentType("text/html; charset=UTF-8");
        int count = (int) getServletContext().getAttribute("count");
        count++;
        getServletContext().setAttribute("count", count);
        PrintWriter out = response.getWriter();
        out.println("当前页面访问量为:" + count);
    }
}
