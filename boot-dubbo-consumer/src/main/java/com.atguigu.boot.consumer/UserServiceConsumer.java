package com.atguigu.boot.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.boot.api.UserService;
import com.atguigu.boot.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/12.
 */
//@Service
@Component
public class UserServiceConsumer {
    @Reference
    //@Autowired
    UserService userService;


    public void users(){
        List<User> users = userService.getUsers();
        System.out.println(users.get(0));
    }
}
