package com.example.demo.annotation;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:29 2021/6/24
 */
public class Apple {

    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西省西安市延安路")
    private String appleProvider;
    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
    public String getAppleProvider() {
        return appleProvider;
    }
}
