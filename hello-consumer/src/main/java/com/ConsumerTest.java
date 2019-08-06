package com;

import com.griftt.HelloApiService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        HelloApiService demoService = (HelloApiService) context.getBean("demoService");
        String hello = demoService.hello("World");
        System.out.println(hello);
        System.in.read();//在控制台按任意键退出
    }
}
