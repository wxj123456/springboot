package com.wang.test;

import com.wang.App;
import com.wang.dao.EnjoyUserMapper;
import com.wang.domain.EnjoyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private EnjoyUserMapper userMapper;
    @Test
    public void testAdd() {
        EnjoyUser user = new EnjoyUser() ;
        user.setPasswd("123");
        user.setUsername("enjoy");
        userMapper.insertSelective(user);
    }

}
