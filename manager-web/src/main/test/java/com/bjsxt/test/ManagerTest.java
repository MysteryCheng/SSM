package com.bjsxt.test;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Mystery
 * @Date: 2020/1/24
 * @Description: com.bjsxt.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
        @Autowired
        private UserMapper userMapper;
        @Test
        public void insertUserTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.userMapper.insertUsers(users);
        }
}
