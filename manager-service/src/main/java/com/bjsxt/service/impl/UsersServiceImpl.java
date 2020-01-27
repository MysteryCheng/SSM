package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Mystery
 * @Date: 2020/1/24
 * @Description: com.bjsxt.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(Users users) {
        this.userMapper.insertUsers(users);
    }
}
