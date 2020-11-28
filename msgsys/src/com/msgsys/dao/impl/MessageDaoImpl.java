package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.MessageDao;
import com.msgsys.entity.Message;
import com.msgsys.entity.User;

import java.util.List;

public class MessageDaoImpl extends BaseDao implements MessageDao {
    @Override
    public int insert(Message message) {
        String sql = "INSERT INTO `T_msg` (`fromUid`, `toUid`, `mTitle`, `mContent`, `readFlag`, `createTime`) VALUES (?, ?, ?, ?, ? ,?)";
        return update(sql, message.getFromUid(), message.getToUid(), message.getmTitle(), message.getmContent(), message.getReadFlag(), message.getCreateTime());
    }

    @Override
    public int update(Message message) {
        String sql = "UPDATE `T_msg` SET `fromUid` = ?, `toUid` = ?, `mTitle` = ?, `mContent` = ?, `readFlag` = ?, `createTime` = ? WHERE `id` = ?";
        return update(sql, message.getFromUid(), message.getToUid(), message.getmTitle(), message.getmContent(), message.getReadFlag(), message.getCreateTime(), message.getId());
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM `T_msg` WHERE `id` = ?";
        return update(sql, id);
    }

    @Override
    public List<Message> queryAll() {
        String sql = "SELECT * FROM `T_msg`";
        return queryForList(Message.class, sql);
    }

    @Override
    public Message queryMessageById(Integer id) {
        String sql = "SELECT * FROM `T_msg` WHERE `id` = ?";
        return queryForOne(Message.class, sql, id);
    }

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        String sql = "SELECT * FROM `T_msg` WHERE `toUid` = ?";
        return queryForList(Message.class, sql, id);
    }
}
