package com.dfrz.day1125.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/day1125/demo01")
public class Demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //显示上次访问时间
        response.setContentType("text/html;charset=utf-8");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String dateStr = simpleDateFormat.format(new Date());
        System.out.println(dateStr);
        Cookie cookie = new Cookie("lastTime", dateStr);
        String name = URLEncoder.encode("姓名", "UTF-8");
        String value = URLEncoder.encode("张三", "UTF-8");

        Cookie cookie2 = new Cookie(name, value);

        cookie.setMaxAge(30 * 24 * 60 * 60);
        response.addCookie(cookie);
        response.addCookie(cookie2);

        Cookie[] cookies = request.getCookies();
        Cookie cookie1 = CookieUtils.findCookie("lastTime", cookies);
        String s = "您是首次访问本站！";
        if (cookie1 != null){
            s = cookie1.getValue();
        }
        response.getWriter().print(s);
    }
}
