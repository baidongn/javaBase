package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Author： bd
 * @Description:   筛选 / 切片
 *
 * 中间操作：
 *
 * filter：接收 Lambda ，从流中排除某些元素
 * limit：截断流，使其元素不超过给定数量
 * skip(n)：跳过元素，返回一个舍弃了前n个元素的流；若流中元素不足n个，则返回一个空流；与 limit(n) 互补
 * distinct：筛选，通过流所生成的 hashCode() 与 equals() 取除重复元素
 * @Date: Created in 14:41 2020/10/22
 */
public class Test01 {
    public static void main(String[] args) {
        List<Employee> emps  = Arrays.asList(
                new Employee(101, "Z3", 19, 9999.99),
                new Employee(102, "L4", 20, 7777.77),
                new Employee(103, "W5", 35, 6666.66),
                new Employee(104, "Tom", 44, 1111.11),
                new Employee(104, "Tom", 44, 1111.11),

                new Employee(104, "Tom", 44, 1111.11),

                new Employee(104, "Tom", 44, 1111.11),

                new Employee(105, "Jerry", 60, 4444.44)
        );
        emps.stream()
                .filter(x -> x.getAge() > 35)
                .limit(3)
                .skip(1)
                .distinct()
                .forEach(System.out::println);
    }
}
