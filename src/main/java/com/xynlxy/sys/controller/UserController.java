package com.xynlxy.sys.controller;

import com.xynlxy.sys.pojo.User;
import com.xynlxy.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("toUserManager")
    public String toUserManager(){
        return "system/userManager";
    }
    @RequestMapping("addUser")
    @ResponseBody
    public Map<String,Object> addUser(User user){

        Map<String,Object> map = new HashMap<>();

        int i = this.userServiceImpl.insUser(user);

        if(i>0){
            map.put("msg","添加成功！");
        }else{
            map.put("msg","添加失败！");
        }

        return map;
    }
}
