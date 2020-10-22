package com.example.demo.lamada.test2;

import java.util.function.Function;

/**
 * @Author： bd
 * @Description:  (a) -> return b;
 * @Date: Created in 13:25 2020/10/22
 */
public class 函数型接口 {
    public static void main(String[] args) {
        Function<String, String> function = (s) -> s.toUpperCase();
        System.out.println(function.apply("asdafasdas"));
    }
}
