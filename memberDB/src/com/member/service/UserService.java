package com.member.service;

import com.member.entity.User;
import com.member.utils.Page;

public interface UserService {
    /**
     * @param pageNo   当前页码
     * @param pageSize 每页展示数量
     * @return 分页后的User Page
     */
    Page<User> queryByPage(int pageNo, int pageSize);
}
