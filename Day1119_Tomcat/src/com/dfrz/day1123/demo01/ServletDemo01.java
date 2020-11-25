package com.dfrz.day1123.demo01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ServletDemo01")
public class ServletDemo01 extends HttpServlet {
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
        request.setAttribute("users", users);
        request.getRequestDispatcher("/day1123/userList.jsp").forward(request, response);
    }
}
