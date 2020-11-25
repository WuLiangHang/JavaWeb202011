package com.dfrz.day1121.demo01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/login")
public class UserServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //把这个值存到ServletContext中
        getServletContext().setAttribute("count", 0);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 它会同时设置服务器和客户端都使用UTF-8 字符集，还设置了响应头
// 此方法一定要在获取流对象之前调用才有效
        response.setContentType("text/html; charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //多个参数名称相同时的获取
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("爱好:" + Arrays.toString(hobbies));
        //把字符串数组转成List
        System.out.println("爱好:" + Arrays.asList(hobbies));

        //获取所有参数的名字
        System.out.println("获取所有参数的名字");
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());
        }

        //将所有参数添加到map中
        System.out.println("将所有参数添加到map中");
        Map<String, String[]> paramMap = request.getParameterMap();
        for (String name :
                paramMap.keySet()) {
            String[] values = paramMap.get(name);
            System.out.println(name + ":" + Arrays.toString(values));
        }
//        String str = "1" + "2";//12
//        String s2 = str + "3";
        System.out.println("用户名 = " + username);
        System.out.println("密码 = " + password);
        //创建响应字符输出流
        PrintWriter out = response.getWriter();

        //假装这是登录接口
        if ("admin".equals(username) && "123".equals(password)) {
            //说明登陆成功
            int count = (int) getServletContext().getAttribute("count");
            count++;
            getServletContext().setAttribute("count", count);
            out.println("<h1>恭喜" + username + "登陆成功</h1>");
            out.println("<h1>您是第" + count + "个登录的用户</h1>");
        } else {
            out.println("<h1>恭喜登录失败</h1>");
        }

    }
}
