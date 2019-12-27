package com.ifnodoraemon.zone.service.impl;

import com.ifnodoraemon.zone.mapper.UserMapper;
import com.ifnodoraemon.zone.model.UserDO;
import com.ifnodoraemon.zone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author ifnodoraemon
 */
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public UserDO getUserByUsername(String username) {
        paramIsNullOrEmpty(username);
        UserDO userDO = userMapper.getUserByUsername(username);
        userIsNotExist(userDO);
        return userDO;
    }

    @Override
    public UserDO getUserByEmail(String email) {
        paramIsNullOrEmpty(email);
        UserDO userDO = userMapper.getUserByEmail(email);
        userIsNotExist(userDO);
        return userDO;
    }

    //TODO
    private void userIsNotExist(UserDO userDO){

    }

    //TODO
    private void paramIsNullOrEmpty(String s){

    }
}
