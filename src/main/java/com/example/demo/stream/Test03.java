package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Author： bd
 * @Description:  排序
 *
 * sorted()：自然排序
 * sorted(Comparator c)：定制排序
 *
 * @Date: Created in 15:19 2020/10/22
 */
public class Test03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,6,3,4,5);
        list.stream()
                .sorted()
                .forEach(System.out::println);

        list.stream()
                .sorted((a, b) ->
                        Integer.compare(a, b)
                )
                .forEach(System.out::println);


    }
}
