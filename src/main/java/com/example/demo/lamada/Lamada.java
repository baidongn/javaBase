package com.example.demo.lamada;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 9:53 2020/10/22
 */
public class Lamada {

    public static void main(String[] args) {

        test09();
    }


    /*
     无参数，无返回值：() -> sout
     */
    public static void test01() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();
    }

    public static void test02() {
        new Thread(() -> {
            System.out.println("hello world");
        }).start();
    }

    /*
     有一个参数，无返回值
     */
    public static void test03() {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        consumer.accept("hello world");
    }

    public static void test04() {
        Consumer consumer = (a) -> System.out.println(a);
        consumer.accept("hello world");
    }

    public static void test05() {
        //小括号可以不写
        Consumer consumer = a -> System.out.println(a);
        consumer.accept("hello world");
    }

    /*
      有两个及以上的参数，有返回值，并且 Lambda 体中有多条语句
     */
    public static void test06() {
        Comparator<Integer> comparator = (a, b) -> {
            System.out.println("比较接口");
            return Integer.compare(a, b);
        };
        System.out.println(comparator.compare(1, 2));
    }

    /*
     * 有两个及以上的参数，有返回值，并且 Lambda 体中只有1条语句 （大括号 与 return 都可以省略不写）
     */
    public static void test07() {
        Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);
        System.out.println(comparator.compare(1, 2));
    }

    /*
     函数式接口
     */
    public static void test08() {
        MyFun myFun = (a, b) -> a + b;
        System.out.println(myFun.cout(5, 3));

        MyFun myFun1 = (a, b) -> a - b;
        System.out.println(myFun1.cout(5, 3));
        ;
    }

    public static void test09() {
        Integer operation = operation(5, 3, (a, b) -> a + b);
        System.out.println(operation);
    }

    public static Integer operation(Integer a, Integer b, MyFun myFun) {
        //实现类在外面写
        return myFun.cout(a, b);
    }


}
