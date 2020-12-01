package com.member.dao.impl;

import com.member.dao.BaseDao;
import com.member.dao.UserDao;
import com.member.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int delete(Long userId) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    //查询当前表的总记录条数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT COUNT(1) FROM `User`";
        return Math.toIntExact((Long) queryForSingleValue(sql));
    }

    @Override
    public List<User> queryUserByPage(int begin, int pageSize) {
        String sql = "SELECT * FROM `User` LIMIT ?, ?";
        return queryForList(User.class, sql, begin, pageSize);
    }
}
