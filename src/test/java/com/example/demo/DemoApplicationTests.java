package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        System.out.println( isValid1("{[]}"));

    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }


        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')') {
                Character pop = stack.pop();
                if (pop != '(') return false;
            }
            if (c == '}') {
                if (stack.empty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '{') return false;
            }
            if (c == ']') {
                if (stack.empty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop != '[') return false;
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;

    }

    public static boolean isValid1(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;
    }

}
