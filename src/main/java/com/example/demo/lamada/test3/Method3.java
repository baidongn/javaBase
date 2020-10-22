package com.example.demo.lamada.test3;

import java.util.function.BiPredicate;

/**
 * @Author： bd
 * @Description: 类::实例方法  比较  :Lambda 参数列表中的第一个参数是方法的调用者，第二个参数是方法的参数时，才能使用 ClassName :: Method
 * @Date: Created in 13:54 2020/10/22
 */
public class Method3 {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (a, b) -> a.equals(b);
        System.out.println(biPredicate.test("a", "a"));

        BiPredicate<String, String> biPredicate2 = String::equals;
        System.out.println(biPredicate2.test("a", "a"));
    }
}
