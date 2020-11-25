package com.charge.test;

import com.charge.dao.ChargeInfoDao;
import com.charge.dao.impl.ChargeInfoDaoImpl;
import com.charge.entity.ChargeInfo;
import org.junit.Test;

public class ChargeInfoTest {
    ChargeInfoDao chargeInfoDao = new ChargeInfoDaoImpl();

    @Test
    public void updateUserTest() {
        chargeInfoDao.updateUser(new ChargeInfo("123456", 0.0, 1));
    }

    @Test
    public void queryUserByIdTest() {
        System.out.println(chargeInfoDao.queryUserById("123456"));
    }
}
