package com.xynlxy.sys.service;

import com.xynlxy.sys.pojo.User;

import java.util.List;

public interface UserService {
    /*
    增加用户
     */
    int insUser(User user);
    /*
    修改用户
     */
    int updUser(User user);
    /*
    删除用户
     */
    int delUser(Integer id);
    /*
    查询用户
     */
    User selUser(User user);
    /*
    查询所有用户
     */
    List<User> selAllUser(User user);
}
