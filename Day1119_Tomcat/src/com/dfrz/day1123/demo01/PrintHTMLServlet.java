package com.dfrz.day1123.demo01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/PrintHTMLServlet")
public class PrintHTMLServlet extends HttpServlet {
    List<User> users;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //假设又是从数据库取出的数据
        users = new ArrayList<>(5);
        users.add(new User(1, "张三"));
        users.add(new User(2, "李四"));
        users.add(new User(3, "王五"));
        users.add(new User(4, "赵六"));
        users.add(new User(5, "田七"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //1.获取对浏览器的字符输出流
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.write("<html lang=\"en\">");
        out.write("<head>");
        out.write("    <meta charset=\"UTF-8\">");
        out.write("    <title>Title</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("    欢迎访问index，看到这个页面 说明Tomcat整合IDEA成功。\n");
        out.write("<table>\n" +
                "    <thead>\n" +
                "    <tr>\n" +
                "        <td>ID</td>\n" +
                "        <td>用户名</td>\n" +
                "    </tr>\n" +
                "    </thead>\n" +
                "    <tbody>");
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            out.write("<tr>");
            out.write("<td>");
            out.write(user.getId().toString());
            out.write("</td>");
            out.write("<td>");
            out.write(user.getUsername());
            out.write("</td>");
            out.write("</tr>");
        }
        out.write("</tbody>");
        out.write("</table>");
        out.write("</body>");
        out.write("</html>");
    }
}
