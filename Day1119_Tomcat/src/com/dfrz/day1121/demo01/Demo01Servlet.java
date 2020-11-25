package com.dfrz.day1121.demo01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//封禁IP
@WebServlet("/banned")
public class Demo01Servlet extends HttpServlet {
    List<String> bannedIP = new ArrayList<>(10);

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //模拟从数据库中查询禁止访问的IP列表
        bannedIP.add("192.168.4.71");
        bannedIP.add("192.168.4.27");
        bannedIP.add("192.168.4.1");
        bannedIP.add("127.0.0.1");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //防止中文乱码
        response.setContentType("text/html; charset=UTF-8");
        String ip = request.getRemoteAddr();//获取客户端IP地址
        System.out.println(ip);
        if (bannedIP.contains(ip)) {
            //1.重定向第一种
            response.setStatus(302);
            response.setHeader("Location", "/Day1119/failed.html");
        } else {
//            response.getWriter().println("宁配访问");
            //不在封禁列表内 允许跳转到其他页面
            //2.重定向第二种(推荐)
            response.sendRedirect("/Day1119/success.html");
        }
    }
}
