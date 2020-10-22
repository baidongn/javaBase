package com.example.demo.lamada.test3;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * @Author： bd
 * @Description:  实现类对象 :: 实例方法
 * @Date: Created in 13:39 2020/10/22
 */
public class Method1 {
    public static void main(String[] args) {
        PrintStream ps = System.out;

        Consumer<String> consumer = (x) ->  ps.println(x);
        consumer.accept("hello ");

        Consumer<String> consumer2 = ps::println;
        consumer2.accept("hello2 ");

    }
}
