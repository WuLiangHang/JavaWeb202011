package com.listener;

import com.entity.User;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        //获取添加到session中的name是否为user
        if (event.getName().equals("user")) {
            //获取在线名单
            Map<String, User> onlineUsers = (Map<String, User>) event.getSession().getServletContext().getAttribute("onlineUsers");
            //如果当前登录的用户是第一个用户
            if (onlineUsers == null) {
                onlineUsers = new LinkedHashMap<String, User>();
            }
            //获取添加到session中的value，即登录的User对象
            User user = (User) event.getValue();
            //把用户保存到在线名单中
            onlineUsers.put(user.getUsername(), user);
            //把在线名单保存到ServletContext中
            event.getSession().getServletContext().setAttribute("onlineUsers", onlineUsers);
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {

    }
}
