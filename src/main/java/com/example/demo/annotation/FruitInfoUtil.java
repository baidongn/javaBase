package com.example.demo.annotation;

import java.lang.reflect.Field;

/**
 * @Author： bd
 * @Description:   注解处理器
 * @Date: Created in 10:30 2021/6/24
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> Class) {

        String strFruitProvicer = "供应商信息：";
        Field[] fields = Class.getDeclaredFields();
        for (Field f :
                fields) {
            if (f.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = f.getAnnotation(FruitProvider.class);

                strFruitProvicer = " 供应商编号：" + fruitProvider.id() + " 供应商名称："
                        + fruitProvider.name() + " 供应商地址：" + fruitProvider.address();
                System.out.println(strFruitProvicer);
            }


        }


    }

    public static void main(String[] args) {

        FruitInfoUtil.getFruitInfo(Apple.class);
    }

}
