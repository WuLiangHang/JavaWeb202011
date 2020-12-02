package com.member.filter;

import com.member.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//拦截 访问某个文件夹的请求
//@WebFilter("/admin/*")//目录匹配
//@WebFilter("/admin/userList.html")//精确匹配
@WebFilter("*.jpg")//后缀名匹配
public class AdminFilter implements Filter {
    public void destroy() {
    }

    //doFilter:专门用于拦截请求 可以做权限检查
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        //如果为null 说明还没登录
        if (user == null) {
            response.sendRedirect("/memberDB/login.html");
        } else {
            //让程序继续往下访问用户的目标资源
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
