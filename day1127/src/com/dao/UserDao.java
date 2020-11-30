package com.dao;

import com.entity.User;

import java.util.List;

public interface UserDao {
    int insert(User user);

    List<User> queryAll();
}
