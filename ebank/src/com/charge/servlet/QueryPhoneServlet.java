package com.charge.servlet;

import com.charge.entity.ChargeInfo;
import com.charge.service.ChargeInfoService;
import com.charge.service.impl.ChargeInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/queryPhone")
public class QueryPhoneServlet extends HttpServlet {
    ChargeInfoService chargeInfoService = new ChargeInfoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone = req.getParameter("phone");
        ChargeInfo chargeInfo = chargeInfoService.queryUserById(phone);
        if (chargeInfo == null) {
            String message = "查找的电话号码不存在";
            req.setAttribute("message", message);
            req.getRequestDispatcher("/searchInfo.jsp").forward(req, resp);
        } else {
            req.setAttribute("chargeInfo", chargeInfo);
            req.getRequestDispatcher("/WEB-INF/manager.jsp").forward(req, resp);
        }
    }
}
