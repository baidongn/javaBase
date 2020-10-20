package com.example.demo.reflect;

import java.lang.reflect.Constructor;

/**
 * @Author： bd
 * @Description: 利用反射获叏构造凼数：
 * @Date: Created in 9:58 2020/10/20
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        createNewObject_2();
    }

    public static void createNewObject_2() throws Exception {
        /*
         * 当获取指定名称对应类中的所体现的对象时，
         * 而该对象初始化不使用空参数构造该怎么办呢？
         * 既然是通过指定的构造 函数进行对象的初始化，
         * 所以应该先获取到该构造函数。 通过字节码文件对象即可完成。
         * 该方法是：getConstructor(paramterTypes);
         *
         */
        String name = "com.example.demo.reflect.Person";

        //找寻该名称类文件，并加载进内存，并产生Class对象。
        Class<?> aClass = Class.forName(name);
        //获取到了指定的构造函数对 象。
        Constructor<?> constructor = aClass.getConstructor(String.class, Integer.class);
        ///通过该构造器对象的newInstance方法进行对象的初始化。
        Object o = constructor.newInstance("小明", 38);
    }
}
