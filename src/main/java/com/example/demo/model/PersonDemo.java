package com.example.demo.model;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 17:22 2020/10/13
 */
public class PersonDemo {
    /*
     装饰设计模式：对一组对象的功能进行增强时，就可以使用该模式进行问题的解决。
     装饰和继承都能实现一样的特点：进行功能的扩展增强，但是装饰比继承灵活，装饰的特点：装饰类和被装饰类
     都必须所属同一个接口或者父类。
     */
    public static void main(String[] args) {
        Person person = new Person();
        NewPerSon newPerSon = new NewPerSon(person);
        newPerSon.chifan();
    }


}

class Person {
    public void chifan() {
        System.out.println("吃饭了！！！");
    }
}

class NewPerSon {
    private Person person;

    NewPerSon(Person p) {
        this.person = p;
    }

    public void chifan() {
        System.out.println("早点！！！");
        person.chifan();
        System.out.println("晚饭！！！");
    }
}
