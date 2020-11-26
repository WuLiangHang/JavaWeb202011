package com.msgsys.servlet;

import com.msgsys.entity.Message;
import com.msgsys.entity.User;
import com.msgsys.service.MessageService;
import com.msgsys.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/message.do")
public class MessageServlet extends BaseServlet {
    MessageService messageService = null;

    public MessageServlet() {
        messageService = new MessageServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    public void queryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        List<Message> messages = messageService.queryMessageByToUid(user.getId());
        request.setAttribute("messages", messages);
        System.out.println(messages);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

}
