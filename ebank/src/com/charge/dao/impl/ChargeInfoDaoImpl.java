package com.charge.dao.impl;

import com.charge.dao.BaseDao;
import com.charge.dao.ChargeInfoDao;
import com.charge.entity.ChargeInfo;

public class ChargeInfoDaoImpl extends BaseDao implements ChargeInfoDao {
    @Override
    public int updateUser(ChargeInfo chargeInfo) {
        String sql = "UPDATE `Charge_info` SET `charge` = ?, `isPay` = ? WHERE `userId` = ?";
        return update(sql, chargeInfo.getCharge(), chargeInfo.getIsPay(), chargeInfo.getUserId());
    }

    @Override
    public ChargeInfo queryUserById(String userId) {
        String sql = "SELECT * FROM `Charge_info` WHERE `userId` = ?";
        return queryForOne(ChargeInfo.class, sql, userId);
    }
}
