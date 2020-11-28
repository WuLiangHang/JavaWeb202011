package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.UserDao;
import com.msgsys.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public int insert(User user) {
        String sql = "INSERT INTO `T_user` (`username`, `password`, `email`, `imgPath`) VALUES (?, ?, ?, ?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getImgPath(), user.getEmail());
    }

    @Override
    public int update(User user) {
        String sql = "UPDATE `T_user` SET `username` = ?, `password` = ?, `email` = ?, `imgPath` = ? WHERE `id` = ?";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getImgPath(), user.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM `T_user` WHERE `id` = ?";
        return update(sql, id);
    }

    @Override
    public List<User> queryAll() {
        String sql = "SELECT * FROM `T_user`";
        return queryForList(User.class, sql);
    }

    @Override
    public User queryUserById(Integer id) {
        String sql = "SELECT * FROM `T_user` WHERE `id` = ?";
        return queryForOne(User.class, sql, id);
    }

    @Override
    public User queryUserByNameAndPassword(User user) {
        String sql = "SELECT * FROM `T_user` WHERE  `username` = ? AND `password` = ?";
        return queryForOne(User.class, sql, user.getUsername(), user.getPassword());
    }

    @Override
    public User queryUserByEmail(String email) {
        String sql = "SELECT * FROM `T_user` WHERE  `email` = ?";
        return queryForOne(User.class, sql, email);
    }
}
