package com.dfrz.day1121.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/testRequest")
public class RequestTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request.getContentLength():" + request.getContentLength());
        System.out.println("request.getContentType():" + request.getContentType());
        System.out.println("request.getContextPath():" + request.getContextPath());
        System.out.println("request.getMethod():" + request.getMethod());
        System.out.println("request.getLocale():" + request.getLocale());
        System.out.println("request.getQueryString():" + request.getQueryString());
        System.out.println("request.getRequestURL():" + request.getRequestURL());
        System.out.println("request.getRequestURI():" + request.getRequestURI());
        System.out.println("request.getServletPath():" + request.getServletPath());
        System.out.println("request.getRemoteAddr():" + request.getRemoteAddr());
        System.out.println("request.getRemoteHost():" + request.getRemoteHost());
        System.out.println("request.getRemotePort():" + request.getRemotePort());
        System.out.println("request.getScheme():" + request.getScheme());
        System.out.println("request.getServerName():" + request.getServerName());
        System.out.println("request.getServerPort():" + request.getServerPort());
    }
}
