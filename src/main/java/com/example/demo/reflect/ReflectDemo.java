package com.example.demo.reflect;

import com.example.demo.IO.FileReaderDemo;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 9:22 2020/10/20
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        getClassObject_1();
    }


    /*
     * 方式三：
     * 只要通过给定的类的 字符串名称就可以获取该类，更为扩展。
     * 可是用Class类中的方法完成。
     * 该方法就是forName.
     * 这种方式只要有名称即可，更为方便，扩展性更强。
     */
    public static void getClassObject_3() throws ClassNotFoundException {
        String className = "com.example.demo.IO.FileReaderDemo";
        Class aClass = Class.forName(className);
        System.out.println(aClass);
    }

    /*
     * 方式二：
     * 2，任何数据类型都具备一个静态的属性.class来获取其对应的Class对象。
     * 相对简单，但是还是要明确用到类中的静态成员。
     * 还是不够扩展。
     *
     */
    public static void getClassObject_2() {

        Class clazz = FileReaderDemo.class;
        Class clazz1 = FileReaderDemo.class;
        System.out.println(clazz==clazz1);

    }

    /*
     * 获取字节码对象的方式：
     * 1，Object类中的getClass()方法的。
     * 想要用这种方式，必须要明确具体的类，并创建对象。
     * 麻烦 .
     *
     */
    public static void getClassObject_1() {
        FileReaderDemo fileReaderDemo = new FileReaderDemo();
        Class aClass = fileReaderDemo.getClass();
        FileReaderDemo fileReaderDemo1 = new FileReaderDemo();
        Class aClass1 = fileReaderDemo1.getClass();
        System.out.println(aClass==aClass1);
    }
}
