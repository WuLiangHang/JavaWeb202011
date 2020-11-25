package com.charge.dao;

import com.charge.entity.ChargeInfo;

public interface ChargeInfoDao {
    int updateUser(ChargeInfo chargeInfo);

    ChargeInfo queryUserById(String userId);
}
