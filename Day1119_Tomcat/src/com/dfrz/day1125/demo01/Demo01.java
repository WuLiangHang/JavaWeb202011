package com.dfrz.day1125.demo01;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User("admin" + i, "" + i);
        }
        for (User u :
                users) {
            u = new User("123", "456");
        }
        for (int i = 0; i < users.length; i++) {
            User u = users[i];
            u = new User("123", "456");
            System.out.println(users[i]);
        }
    }

    @Test
    public void test01() {
        System.out.println(new Date().toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String dateStr = simpleDateFormat.format(new Date());
        System.out.println(dateStr);
    }
}
