package com.servlet;

import com.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        login(request,response);
    }

    public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取登录的用户名
        String username = request.getParameter("username");
        //在ServletContext 获取“在线名单”
        Map<String, User> onlineUsers = (Map<String, User>) getServletContext().getAttribute("onlineUsers");
        //如果在线名单存在
        if (onlineUsers != null) {
            //如果在线名单中已经存在这个用户名
            if (onlineUsers.containsKey(username)) {
                //转发到登录页面，显示错误信息
                request.setAttribute("msg", "用户" + username + "已经登录");
                return "/index.jsp";
            }
        }
        //获取IP地址
        String ip = request.getRemoteAddr();
        //获取登录时间
        String loginTime = String.format("%tF %<tT", new Date());
        //创建User对象
        User user = new User();
        user.setUsername(username);
        user.setIp(ip);
        user.setLoginTime(loginTime);
        //把User对象保存到Session中 这时会执行 监听器的attributeAdded()或attributeReplaced()方法
        request.getSession().setAttribute("user", user);
        //重定向到user.jsp显示在线用户名单
        response.sendRedirect(request.getContextPath() + "/user.jsp");
        return null;
    }
}

