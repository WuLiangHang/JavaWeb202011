package com.dfrz.day1120;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet1 extends HttpServlet {

    public MyServlet1() {
        System.out.println("1.无参构造函数被调用");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 方法被调用");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost 方法被调用");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut 方法被调用");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete 方法被调用");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("2.init初始化方法");
        //1.可以获取Servlet程序的别名 servlet-name的值
        System.out.println("HelloServlet2的别名是:" + config.getServletName());
        //2.获取初始化参数init-param
        System.out.println("初始化参数username的值是:" + config.getInitParameter("username"));
        System.out.println("初始化参数url的值是:" + config.getInitParameter("url"));
        //3.获取ServletContext对象
        System.out.println(config.getServletContext());
    }
}
