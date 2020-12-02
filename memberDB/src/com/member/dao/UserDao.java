package com.member.dao;

import com.member.entity.User;

import java.util.List;

public interface UserDao {
    int insert(User user);

    int delete(Long userId);

    int update(User user);

    List<User> queryAll();

    User queryUserByNameAndPassword(User user);

    User queryUserById(Long id);

    //查询当前表的总记录条数
    Integer queryPageTotalCount();

    //分页查询
    List<User> queryUserByPage(int begin, int pageSize);
}
