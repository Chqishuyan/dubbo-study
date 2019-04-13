package com.atguigu.boot.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.boot.api.UserEditService;
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
    /**
     * 1）dubbo使用zookeeper作为注册中心时，若zookeeper宕机，服务提供者和服务消费者还可以通过本地缓存的信息来通讯
     * 2）dubbo还可以通过直连的方式来消费服务
     */
    @Reference//(url = "localhost:20883")
    //@Autowired
    UserService userService;

    @Reference
    UserEditService userEditService;


    public List<User> users(){
        return userService.getUsers();
    }

    public void add(){
        userEditService.add(null);
    }
}
