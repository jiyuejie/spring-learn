package com.spring.test.service.impl;

import com.spring.test.aspect.Logger;
import com.spring.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Logger("姬跃杰")
    public String getStudent() {
        System.out.println("获取student");
//        int i = 1/0;
//        System.out.println(i);
        return "UserService.getStudent()";
    }

    public String update(String id) {
        System.out.println("update id:" + id);
        return "UserService.update()";
    }
}
