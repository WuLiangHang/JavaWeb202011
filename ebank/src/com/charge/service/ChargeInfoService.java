package com.charge.service;

import com.charge.entity.ChargeInfo;

public interface ChargeInfoService {
    int updateUser(ChargeInfo chargeInfo);

    ChargeInfo queryUserById(String userId);
}
