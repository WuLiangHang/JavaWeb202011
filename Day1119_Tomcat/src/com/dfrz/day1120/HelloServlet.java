package com.dfrz.day1120;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebServlet("/hello")
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("HelloServlet无参构造函数");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet被初始化 执行init()方法。");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //专门用来处理请求和响应的
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet被访问了。");
        //请求信息的获取(HttpServletRequest 有getMethod()方法)
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        System.out.println();
        switch (httpServletRequest.getMethod()) {
            case "GET":
                System.out.println("GET请求");
                break;
            case "POST":
                System.out.println("POST请求");
                break;
            case "PUT":
                System.out.println("PUT请求");
                break;
            case "DELETE":
                System.out.println("DELETE请求");
                break;
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("web工程停止，HelloServlet被销毁。");
    }
}