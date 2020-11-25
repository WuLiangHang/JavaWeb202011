package com.charge.service.impl;

import com.charge.dao.ChargeInfoDao;
import com.charge.dao.impl.ChargeInfoDaoImpl;
import com.charge.entity.ChargeInfo;
import com.charge.service.ChargeInfoService;

public class ChargeInfoServiceImpl implements ChargeInfoService {
    ChargeInfoDao chargeInfoDao = new ChargeInfoDaoImpl();

    @Override
    public int updateUser(ChargeInfo chargeInfo) {
        return chargeInfoDao.updateUser(chargeInfo);
    }

    @Override
    public ChargeInfo queryUserById(String userId) {
        return chargeInfoDao.queryUserById(userId);
    }
}
