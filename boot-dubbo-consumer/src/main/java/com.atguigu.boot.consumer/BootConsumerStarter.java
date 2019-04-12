package com.atguigu.boot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * Created by shuyan.qi on 2019/4/11.
 */
//@EnableDubbo
@ImportResource("classpath:boot-dubbo-consumer.xml")
@SpringBootApplication
public class BootConsumerStarter {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(BootConsumerStarter.class, args);
        UserServiceConsumer userServiceConsumer = (UserServiceConsumer)run.getBean("userServiceConsumer");
        userServiceConsumer.users();
        System.in.read();
    }
}
