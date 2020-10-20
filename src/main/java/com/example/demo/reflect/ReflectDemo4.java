package com.example.demo.reflect;

import java.lang.reflect.Method;

/**
 * @Author： bd
 * @Description:  利用反射获叏Class中的公共凼数：
 * @Date: Created in 10:57 2020/10/20
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        getMethodDemo();
    }

    public static void getMethodDemo_3() throws Exception {
        Class<?> aClass = Class.forName("com.example.demo.reflect.Person");
        Method method = aClass.getMethod("paramMethod", String.class, Integer.class);
        Object obj = aClass.newInstance();
        method.invoke(obj, "小强",86);
    }
    public static void getMethodDemo() throws Exception {
        Class<?> aClass = Class.forName("com.example.demo.reflect.Person");
        Method[] methods = aClass.getMethods();//获取的都是公有的方法。
//        methods = aClass.getDeclaredMethods();//只获取 本类 中所有方法，包含私有
        for(Method method : methods){
            System.out.println(method);
        }
    }
}
