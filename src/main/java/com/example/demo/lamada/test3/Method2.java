package com.example.demo.lamada.test3;

import java.util.Comparator;

/**
 * @Author： bd
 * @Description:  类::静态方法
 * @Date: Created in 13:47 2020/10/22
 */
public class Method2 {
    public static void main(String[] args) {
        Comparator<Integer> com1 = (a, b) -> Integer.compare(a, b);
        System.out.println(com1.compare(5, 6));

        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(5, 6));
    }
}
