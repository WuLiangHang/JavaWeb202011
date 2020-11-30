package com.dfrz.day1126.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/day1126/Demo01Servlet")
public class Demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //第一次调用时：创建Session会话
        //之后调用：获取前面创建好的session对象
        HttpSession session = request.getSession();
        //判断是否刚创建
        System.out.println("session是否为新建：" + session.isNew());
        System.out.println("sessionId : " + session.getId());
        session.setAttribute("username", "张三");
        //值为正数时 设定session的超时时间
        //负数 表示用不超时（极少使用）
        //以秒为单位
        session.setMaxInactiveInterval(60 * 60);
        //获取session的超时时间
        System.out.println(session.getMaxInactiveInterval());
        //让当前session会话马上超时无效
//        session.invalidate();
    }


}
