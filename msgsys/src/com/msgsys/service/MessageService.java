package com.msgsys.service;

import com.msgsys.entity.Message;

import java.util.List;

public interface MessageService {
    //根据收信人的ID查询邮件
    List<Message> queryMessageByToUid(Integer id);

    //根据id查询邮件详情
    Message queryMessageById(Integer id);

    int insert(Message message);

    int update(Message message);

    int delete(Integer id);
}
