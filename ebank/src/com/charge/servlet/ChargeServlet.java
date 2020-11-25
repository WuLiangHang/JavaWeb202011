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

@WebServlet("/charge")
public class ChargeServlet extends HttpServlet {
    ChargeInfoService chargeInfoService = new ChargeInfoServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        ChargeInfo chargeInfo = new ChargeInfo(phone, 0.0, 1);
        String message = (chargeInfoService.updateUser(chargeInfo) > 0) ? "缴费成功" : "缴费失败";
        request.setAttribute("message", message);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
