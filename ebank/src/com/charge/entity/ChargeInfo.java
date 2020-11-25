package com.charge.entity;

import java.io.Serializable;

public class ChargeInfo {
    private String userId;
    private Double charge;
    private Integer isPay;

    public ChargeInfo(String userId, Double charge, Integer isPay) {
        this.userId = userId;
        this.charge = charge;
        this.isPay = isPay;
    }

    public ChargeInfo() {
    }

    @Override
    public String toString() {
        return "ChargeInfo{" +
                "userId='" + userId + '\'' +
                ", charge=" + charge +
                ", isPay=" + isPay +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }
}
