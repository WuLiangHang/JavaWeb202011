package com.msgsys.service.impl;

import com.msgsys.dao.MessageDao;
import com.msgsys.dao.impl.MessageDaoImpl;
import com.msgsys.entity.Message;
import com.msgsys.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {
    MessageDao messageDao = new MessageDaoImpl();

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        return messageDao.queryMessageByToUid(id);
    }

    @Override
    public Message queryMessageById(Integer id) {
        return messageDao.queryMessageById(id);
    }

    @Override
    public int insert(Message message) {
        return messageDao.insert(message);
    }

    @Override
    public int update(Message message) {
        return messageDao.update(message);
    }

    @Override
    public int delete(Integer id) {
        return messageDao.delete(id);
    }
}
