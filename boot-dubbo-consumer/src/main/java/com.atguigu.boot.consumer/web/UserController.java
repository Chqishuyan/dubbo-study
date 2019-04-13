package com.atguigu.boot.consumer.web;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.consumer.service.UserServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/13.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserServiceConsumer userServiceConsumer;

    @RequestMapping("users")
    public List<User> users(){
        return userServiceConsumer.users();
    }

    @RequestMapping("add")
    public void add(){
        userServiceConsumer.add();
    }
}
