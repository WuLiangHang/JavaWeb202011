package com.dao.impl;

import com.dao.BaseDao;
import com.dao.UserDao;
import com.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int insert(User user) {
        String sql = "INSERT INTO `User` (`username`, `password`, `imgPath`) VALUES (?, ?, ?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getImgPath());
    }

    @Override
    public List<User> queryAll() {
        String sql = "SELECT * FROM `User`";
        return queryForList(User.class, sql);
    }
}
