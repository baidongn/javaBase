package com.example.spring;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 17:32 2020/10/27
 */
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "hello world";
    }
}
