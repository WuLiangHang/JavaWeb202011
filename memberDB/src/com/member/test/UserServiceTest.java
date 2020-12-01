package com.member.test;

import com.member.service.UserService;
import com.member.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void testPage() {
        System.out.println(userService.queryByPage(1, 5));
    }
}
