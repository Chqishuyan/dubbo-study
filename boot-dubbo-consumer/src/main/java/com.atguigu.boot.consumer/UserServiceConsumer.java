package com.atguigu.boot.consumer;

import api.UserService;
import bean.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/12.
 */
@Service
public class UserServiceConsumer {
    @Reference
    UserService userService;

    public void users(){
        List<User> users = userService.getUsers();
        System.out.println(users.get(0));
    }
}
