package com.soyoung.battle.ground.service.impl;

import com.soyoung.battle.ground.dao.db.UserMapper;
import com.soyoung.battle.ground.dao.db.UserPo;
import com.soyoung.battle.ground.model.UserInfo;
import com.soyoung.battle.ground.service.UserService;
import com.soyoung.battle.ground.service.convert.UserConvert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserById(Integer id) {

        UserPo userPo = null;
        try {
            userPo = userMapper.getUser(id);
        } catch (Exception e) {
            logger.error(">>>e:{}",e);
        }

        return UserConvert.UserPo2Info(userPo);
    }
}
