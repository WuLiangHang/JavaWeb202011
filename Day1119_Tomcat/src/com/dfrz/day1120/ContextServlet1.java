package com.dfrz.day1120;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello3")
public class ContextServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取web.xml中配置的上下文参数
        ServletContext context = this.getServletConfig().getServletContext();//可以简写为getServletContext()
        String username = context.getInitParameter("username");
        System.out.println("context-param参数username的值是:" + username);
        String password = context.getInitParameter("password");
        System.out.println("context-param参数password的值是:" + password);
        //2.获取当前的工程路径： /工程路径
        System.out.println("当前工程路径：" + context.getContextPath());
        //3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("工程部署的路径是：" + context.getRealPath("/"));
        System.out.println("工程下index.html的绝对路径是:" + context.getRealPath("/index.html"));
    }
}
