package com.dfrz.day1125.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//显示曾经浏览过的商品
@WebServlet("/day1125/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    //toy,car,grape
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodsName = request.getParameter("name");
        //获取到cookie中goods
        Cookie goodsNameCookie = CookieUtils.findCookie("goods", request.getCookies());
        if (goodsNameCookie == null) {
            Cookie cookie = new Cookie("goods", goodsName);
            cookie.setMaxAge(3 * 24 * 60 * 60);
            response.addCookie(cookie);
            //重定向:/ 代表 定位到 IP地址和端口号 工程名需要额外写
            response.sendRedirect("/Day1119/day1125/goodsList.jsp");
            return;
        }
        String goods = goodsNameCookie.getValue();
        if (goods != null) {
            String[] arr = goods.split("&");
            //LinkedHashSet  基于链式结构的HashSet集合 有序 不重复
            Set<String> goodsSet = new LinkedHashSet<>(Arrays.asList(arr));
            goodsSet.add(goodsName);
            goods = goodsSet.toString();//[car, wash]
            goods = goods.substring(1, goods.length() - 1);
            goods = goods.replaceAll(", ", "&");
            System.out.println(goods);
        } else {
            goods = goodsName;
        }
        Cookie cookie = new Cookie("goods", goods);
        cookie.setMaxAge(3 * 24 * 60 * 60);
        response.addCookie(cookie);
        //重定向:/ 代表 定位到 IP地址和端口号 工程名需要额外写
        response.sendRedirect("/Day1119/day1125/goodsList.jsp");
    }
}
