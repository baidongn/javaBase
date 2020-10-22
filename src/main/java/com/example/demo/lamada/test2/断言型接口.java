package com.example.demo.lamada.test2;

import java.util.function.Predicate;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:29 2020/10/22
 */
public class 断言型接口 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (a) -> a == 5;

        System.out.println(predicate.test(6));
    }
}
