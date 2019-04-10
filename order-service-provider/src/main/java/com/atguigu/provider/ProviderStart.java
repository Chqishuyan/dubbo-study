package com.atguigu.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by shuyan.qi on 2019/4/10.
 */
public class ProviderStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        classPathXmlApplicationContext.start();
        System.out.println("provider ProviderStart start...");
        System.in.read(); // 按任意键退出
    }
}
