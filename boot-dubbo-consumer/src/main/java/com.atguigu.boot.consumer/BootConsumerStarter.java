package com.atguigu.boot.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.atguigu.boot.consumer.service.UserServiceConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;

/**
 * Created by shuyan.qi on 2019/4/11.
 */
//@EnableDubbo
//@ImportResource("classpath:boot-dubbo-consumer.xml")
@DubboComponentScan(basePackages = "com.atguigu.boot.consumer")
@EnableWebMvc
@EnableHystrix//开启Hystrix的服务容错
@SpringBootApplication
public class BootConsumerStarter {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(BootConsumerStarter.class, args);
       /* UserServiceConsumer userServiceConsumer = (UserServiceConsumer)run.getBean("userServiceConsumer");
        userServiceConsumer.users();
        System.in.read();*/
    }
}
