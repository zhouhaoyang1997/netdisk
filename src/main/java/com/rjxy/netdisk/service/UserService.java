package com.rjxy.netdisk.service;

import com.rjxy.netdisk.mapper.UserMapper;
import com.rjxy.netdisk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author zhy
 * @create 2017-11-03 00:13
 **/
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void insertUser(User user){
        userMapper.insertAdmin(user);
    }

    public User getUserByUserId(int userId) {
        return userMapper.getUserByUserId(userId);
    }

    public User judgeUser(User user) {
        System.out.println(user);
        return userMapper.judgeUser(user);
    }

}
