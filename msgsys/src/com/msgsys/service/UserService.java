package com.msgsys.service;

import com.msgsys.entity.User;

public interface UserService {
    //注册
    int register(User user);

    //登录
    User login(User user);
}
