package com.servlet;

import com.utils.FileUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fileDownload")
public class FileDownloadServlet extends HttpServlet {

    public FileDownloadServlet() {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        config.getServletContext().setAttribute("count", 1);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getParameter("path");
        try {
            FileUtils.singleDownload(request, response, path, getServletContext().getAttribute("count") + ".jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
