package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: Mystery
 * @Date: 2020/1/24
 * @Description: com.bjsxt.mapper
 * @version: 1.0
 */
public interface UserMapper {

    void insertUsers(Users users);

    List<Users> selectUserAll();

}
