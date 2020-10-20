package com.example.demo.reflect;

import java.lang.reflect.Field;

/**
 * @Author： bd
 * @Description:  利用反射获叏字段
 * @Date: Created in 10:27 2020/10/20
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        getFieldDemo();

    }

    public static void getFieldDemo() throws Exception {
        Class<?> aClass = Class.forName("com.example.demo.reflect.Person");

        Field field = null;
//        field = aClass.getField("year");  //该方法只能获取  公有的方法

        field =  aClass.getDeclaredField("year"); //该方法 只获取本类，但是包含私有
        field.setAccessible(true);//对私有字段的访问取消权限检查。暴力访问。  可以赋值

        Object obj = aClass.newInstance();
        field.set(obj, 89);
        Object o = field.get(obj);
        System.out.println(o);

    }


}
