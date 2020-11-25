package com.dfrz.day1123.demo02;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        User user = new User();
        //设置JavaBean属性
        BeanUtils.setProperty(user, "username", "admin");
        BeanUtils.setProperty(user, "password", "123");
        //获取JavaBean属性
        String username = BeanUtils.getProperty(user, "username");
        String password = BeanUtils.getProperty(user, "password");
        System.out.println("username = " + username + ", password = " + password);
        System.out.println(user);

        //将Map数据封装到JavaBean对象中
        Map<String, String> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123");
        User user1 = new User();
        BeanUtils.populate(user1, map);
        System.out.println(user1);

    }
}
