package com.example.demo.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author： bd
 * @Description: 归约 / 收集
 *
 * 归约：reduce(T identity, BinaryOperator) / reduce(BinaryOperator) 可以将流中的数据反复结合起来，得到一个值
 * 收集：collect 将流转换成其他形式；接收一个 Collector 接口的实现，用于给流中元素做汇总的方法
 *
 *
 * @Date: Created in 15:32 2020/10/22
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer integer = list.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(integer);


        List<Employee> emps = Arrays.asList(
                new Employee(101, "Z3", 19, 9999.99),
                new Employee(102, "L4", 20, 7777.77),
                new Employee(103, "W5", 35, 6666.66),
                new Employee(104, "Tom", 44, 1111.11),
                new Employee(105, "Jerry", 60, 4444.44)
        );
        //放入list
        List<Integer> list1 = emps.stream()
                .map(Employee::getAge)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);

        //放入LinkedHashSet
        LinkedHashSet<String> linkedHashSet = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        linkedHashSet.forEach(System.out::println);

        //总数
        Long collect = emps.stream()
                .collect(Collectors.counting());
        System.out.println(collect);

        //平均值
        Double avg  = emps.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);

        //总和
        Double sum = emps.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);

        //最大值
        Optional<Employee> max = emps.stream()
                .collect(Collectors.maxBy((a, b) ->
                        Double.compare(a.getSalary(), b.getSalary())));
        System.out.println(max);

        //最小值
        Optional<Double> min = emps.stream()
                .map(Employee::getSalary)
                .collect(Collectors.minBy(Double::compare));
        System.out.println(min);

        //连接
        String str = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.joining("-"));

        System.out.println(str);

        //分组
        Map<Integer, List<Employee>> map = emps.stream()
                .collect(Collectors.groupingBy(Employee::getId));
        System.out.println(map);

        //多级分组  分组后 里面的数据再分组
        Map<Integer, Map<String, List<Employee>>> mapMap = emps.stream()
                .collect(Collectors.groupingBy(Employee::getId, Collectors.groupingBy((e) -> {
                    if (e.getAge() > 35) {
                        return "开除";
                    } else {
                        return "继续加班";
                    }
                })));
        System.out.println(mapMap);

        ////分区  只有两组
            Map<Boolean, List<Employee>> listMap = emps.stream()
                .collect(Collectors.partitioningBy((e) -> e.getSalary() > 4321));
            System.out.println(listMap);
    }
}
