package com.xynlxy.sys.service.impl;

import com.xynlxy.sys.mapper.UserMapper;
import com.xynlxy.sys.pojo.User;
import com.xynlxy.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int insUser(User user) {
        return this.userMapper.insUser(user);
    }

    @Override
    public int updUser(User user) {
        return this.userMapper.updUser(user);
    }

    @Override
    public int delUser(Integer id) {
        return this.userMapper.delUser(id);
    }

    @Override
    public User selUser(User user) {
        return this.userMapper.selUser(user);
    }

    @Override
    public List<User> selAllUser(User user) {
        return this.userMapper.selAllUser(user);
    }
}
