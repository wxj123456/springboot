package com.wang.service.impl;

import com.wang.dao.EnjoyUserMapper;
import com.wang.domain.EnjoyUser;
import com.wang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private EnjoyUserMapper userMapper;

    @Override
    public boolean login(String username, String passwd) {
        EnjoyUser user = userMapper.findByUsernameAndPasswd(username, passwd);
        return user != null;
    }

    @Override
    public boolean register(String username, String passwd) {
        EnjoyUser users = new EnjoyUser();
        users.setUsername(username);
        users.setPasswd(passwd);
        int cnt = userMapper.insertSelective(users);
        return cnt > 0;

    }

    @Override
    @Transactional
    public void batchAdd(String username, String passwd) {
        EnjoyUser users = new EnjoyUser();
        users.setUsername(username);
        users.setPasswd(passwd);
        userMapper.insertSelective(users);
        int i = 10 / 0;
        users = new EnjoyUser();
        users.setUsername(username + "2");
        users.setPasswd(passwd);
        userMapper.insertSelective(users);

    }
}
