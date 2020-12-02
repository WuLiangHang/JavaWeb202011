package com.member.dao.impl;

import com.member.dao.BaseDao;
import com.member.dao.UserDao;
import com.member.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int insert(User user) {
        String sql = "INSERT INTO `User` (`username`, `password`, `image`, `type`, `status`) VALUES (?, ?, ?, ?, ?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getImage(), user.getType(), user.getStatus());
    }

    @Override
    public int delete(Long userId) {
        String sql = "DELETE FROM `User` WHERE `id` = ?";
        return update(sql, userId);
    }

    @Override
    public int update(User user) {
        String sql = "UPDATE `User` SET `username` = ?, `password` = ?, `image` = ?, `type` = ?, `status` = ? WHERE `id` = ?";
        return update(sql, user.getUsername(), user.getPassword(), user.getImage(), user.getType(), user.getStatus(), user.getId());
    }

    @Override
    public List<User> queryAll() {
        String sql = "SELECT * FROM `User`";
        return queryForList(User.class, sql);
    }

    @Override
    public User queryUserById(Long id) {
        String sql = "SELECT * FROM `User` WHERE `id` = ?";
        return queryForOne(User.class, sql, id);
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
