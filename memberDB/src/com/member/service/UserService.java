package com.member.service;

import com.member.entity.User;
import com.member.utils.Page;

import java.util.List;

public interface UserService {
    /**
     * @param pageNo   当前页码
     * @param pageSize 每页展示数量
     * @return 分页后的User Page
     */
    Page<User> queryByPage(int pageNo, int pageSize);

    int insert(User user);

    int delete(Long userId);

    int update(User user);

    List<User> queryAll();

    User queryUserById(Long id);

    //登录
    User login(User user);
}
