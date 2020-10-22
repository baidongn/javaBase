package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author： bd
 * @Description: 查找 / 匹配
 *
 * 终止操作：
 *
 * allMatch：检查是否匹配所有元素
 * anyMatch：检查是否至少匹配一个元素
 * noneMatch：检查是否没有匹配所有元素
 * findFirst：返回第一个元素
 * findAny：返回当前流中的任意元素
 * count：返回流中元素的总个数
 * max：返回流中最大值
 * min：返回流中最小值
 * @Date: Created in 15:24 2020/10/22
 */
public class Test04 {
    public static void main(String[] args) {
        List<Status> list = Arrays.asList(Status.FREE, Status.BUSY, Status.VOCATION);

        boolean a = list.stream()
                .allMatch(x -> x.equals(Status.FREE));
        System.out.println(a);

        boolean b = list.stream()
                .anyMatch(x -> x.equals(Status.FREE));
        System.out.println(b);

        boolean c = list.stream()
                .noneMatch(x -> x.equals(Status.FREE));
        System.out.println(c);

        Optional<Status> first = list.stream().findFirst();
        Status status = first.orElse(Status.BUSY);
        System.out.println(status);

        Optional<Status> op2 = list.stream()
                .findAny();
        System.out.println(op2);

        long count = list.stream()
                .count();
        System.out.println(count);

    }
}

enum Status {
    FREE, BUSY, VOCATION;
}
