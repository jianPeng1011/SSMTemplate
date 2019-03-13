package com.xynlxy.sys.mapper;

import com.xynlxy.sys.pojo.User;

import java.util.List;

public interface UserMapper {
    int insUser(User user);

    int updUser(User user);

    int delUser(Integer id);

    User selUser(User user);

    List<User> selAllUser(User user);
}
