package com.auguigu.consumer;

import com.atguigu.api.UserService;
import com.atguigu.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/10.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        classPathXmlApplicationContext.start();
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        List<User> users = userService.users();
        //users.stream().forEach((e)-> System.out.println(e));
        System.in.read(); // 按任意键退出
    }
}
