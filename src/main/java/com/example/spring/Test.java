package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 17:23 2020/10/27
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("启动成功");
        MessageService bean = context.getBean(MessageService.class);
        System.out.println(bean.getMessage());

    }
}
