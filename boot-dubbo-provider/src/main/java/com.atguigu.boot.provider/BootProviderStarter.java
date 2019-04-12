package com.atguigu.boot.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * springBoot集成dubbo：
 *  方式1：在application配置文件中保存dubbo配置信息，使用@Service【暴露服务】，@Reference【引用服务】
 * Created by shuyan.qi on 2019/4/11.
 */
@EnableDubbo
@SpringBootApplication
public class BootProviderStarter {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(BootProviderStarter.class,args);
        System.in.read();
    }
}
