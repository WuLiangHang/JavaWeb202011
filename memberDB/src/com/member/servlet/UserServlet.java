package com.member.servlet;

import com.google.gson.Gson;
import com.member.entity.User;
import com.member.service.UserService;
import com.member.service.impl.UserServiceImpl;
import com.member.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    public void queryPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer pageNo = Integer.valueOf(request.getParameter("pageNo"));
        Page<User> page = userService.queryByPage(pageNo, Page.PAGE_SIZE);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(page);
        response.getWriter().write(jsonStr);
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Long userId = Long.valueOf(request.getParameter("userId"));
        Integer result = userService.delete(userId);
        response.getWriter().write(result.toString());
    }

    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        User user1 = userService.login(user);
        if (user1 == null) {
            //登录失败
            response.getWriter().write("false");
//            response.sendRedirect("/login.html");
        } else {
            //登录成功
            response.getWriter().write("true");
            request.getSession().setAttribute("user", user1);
        }
    }

    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect("/memberDB/login.html");
    }

}
