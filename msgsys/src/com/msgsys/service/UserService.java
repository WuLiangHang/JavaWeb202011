package com.msgsys.service;

import com.msgsys.entity.User;

import java.util.List;

public interface UserService {
    //注册
    int register(User user);

    //登录
    User login(User user);

    int insert(User user);

    int update(User user);

    int delete(Integer id);

    List<User> queryAll();

    User queryUserById(Integer id);

    User queryUserByEmail(String email);
}
