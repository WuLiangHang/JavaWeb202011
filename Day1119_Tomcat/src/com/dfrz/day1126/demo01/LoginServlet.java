package com.dfrz.day1126.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@WebServlet("/day1126/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        //获取验证码
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("谷歌生成的验证码值:" + token);
        String code = request.getParameter("code");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (token != null && token.equalsIgnoreCase(code)) {
            if ("admin".equals(username) && "123".equals(password)) {
                //当登录成功时，获取session对象
                User user = new User(username, password);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("/Day1119/day1126/index1.jsp");
            }
        }else{
            response.getWriter().print("验证码输入错误!");
        }

    }
}
