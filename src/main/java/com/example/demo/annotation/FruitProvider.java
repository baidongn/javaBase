package com.example.demo.annotation;

import java.lang.annotation.*;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:27 2021/6/24
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     */
    public int id() default -1;

    /*** 供应商名称*/
    public String name() default "";

    /**
     * 供应商地址
     */
    public String address() default "";


}
