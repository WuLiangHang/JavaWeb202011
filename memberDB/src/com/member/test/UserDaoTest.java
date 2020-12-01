package com.member.test;

import com.member.dao.UserDao;
import com.member.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void testQueryPageTotalCount() {
        System.out.println(userDao.queryPageTotalCount());
    }

    @Test
    public void testQueryUserByPage() {
        System.out.println(userDao.queryUserByPage(0,5));
    }
}
