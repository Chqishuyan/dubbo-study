package com.atguigu.boot.consumer;

import com.atguigu.boot.api.UserService;
import com.atguigu.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/12.
 */
//@Service
public class UserServiceConsumer {
    //@Reference
    @Autowired
    UserService userService;


    public void users(){
        List<User> users = userService.getUsers();
        System.out.println(users.get(0));
    }
}
