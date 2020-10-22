package com.example.demo.lamada.test2;

import java.util.function.Consumer;

/**
 * @Author： bd
 * @Description:  ()-> sout()
 * @Date: Created in 13:19 2020/10/22
 */
public class 消费型接口 {
    public static void main(String[] args) {
        Consumer consumer = x -> System.out.println("消费型接口" + x);
        consumer.accept(55);
    }
}
