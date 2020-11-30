package com.msgsys.servlet;

import com.msgsys.entity.User;
import com.msgsys.service.UserService;
import com.msgsys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    //注册
    public void register(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        //金句：防止中文乱码
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        User user = new User(username, password, email);
        int result = userService.register(user);
        System.out.println(result);
    }

    //登录
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //金句：防止中文乱码
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.login(new User(username, password, null));
        if (user != null) {
            //登录成功
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            request.getRequestDispatcher("/message.do?action=queryList").forward(request, response);
        } else {
            //登录失败
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
    }

    //通过用户名查询用户
    public void queryUserByUsername(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //金句：防止中文乱码
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        User user = userService.queryUserByUsername(username);
        String message = (user == null) ? "<font color=\"green\">用户名可用</font>" : "<font color=\"red\">用户名不可用</font>";
        response.getWriter().write(message);
    }
}
