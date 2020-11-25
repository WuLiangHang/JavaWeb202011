package com.dfrz.day1125.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/day1125/AServlet")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //生成一个随机字符串
        String id = UUID.randomUUID().toString();
        //创建Cookie对象 指定名字和值
        Cookie cookie1 = new Cookie("id1", id);
        Cookie cookie2 = new Cookie("id2", id);
        Cookie cookie3 = new Cookie("id3", id);
        Cookie cookie4 = new Cookie("id4", id);
        //cookie1 不指定 session级别 当浏览器被关闭 cookie也被从硬盘和浏览器内存中删除
        //cookie2 指定 -1 session级别 当浏览器被关闭 cookie也被从硬盘和浏览器内存中删除
        //cookie3 指定 60 单位：秒 到期自动删除
        //cookie4 0 立即删除
        cookie2.setMaxAge(-1);
        cookie3.setMaxAge(60);
        cookie4.setMaxAge(0);
        //在响应中添加Cookie对象
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        response.addCookie(cookie4);

        response.getWriter().println("已经给你发送了ID cookie");
    }
}
