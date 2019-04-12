package com.atguigu.boot.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

/**
 * Created by shuyan.qi on 2019/4/11.
 */
@EnableDubbo
@SpringBootApplication
public class BootConsumerStarter {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(BootConsumerStarter.class, args);
        UserServiceConsumer userServiceConsumer = (UserServiceConsumer)run.getBean("userServiceConsumer");
        userServiceConsumer.users();
        System.in.read();
    }
}
