package com.dfrz.day1126.demo02;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//实现监听器接口：
public class MyServletContextListener implements ServletContextListener {
    //ServletContext对象被创建时调用
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁");
    }
}
