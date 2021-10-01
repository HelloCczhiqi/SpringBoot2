package com.demo.Serveict.Impl;

import com.demo.Serveict.UserServict;
import com.demo.bean.User;
import com.demo.mapper.LoginMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServictImpl implements UserServict {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public User getUser(String username, String password) {
        User user = loginMapper.getUser(username, password);
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public int adduser(User user) {
        return loginMapper.adduser(user);
    }

    @Override
    public int inset(String username, String password) {
        return loginMapper.inset(username, password);
    }
}
