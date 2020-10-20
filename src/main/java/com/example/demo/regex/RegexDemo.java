package com.example.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:19 2020/10/20
 */
public class RegexDemo {
    public static void main(String[] args) {
        /*
         * 正则表达式对字符串的常见操作:
         * 1, 匹配。
         * 其实使用的就是String类中的matches方法。
         *
         * 2，切割。
         * 其实使用的就是String类中的split方法。
         *
         * 3，替换。
         * 其实使用的就是String类中的replaceAll()方法。
         *
         * 4，获取。
         *
         */
        functionDemo_4();
    }

    /*
     * 获取
     * 将正则规则进行对象的封装。
     * Pattern p = Pattern.compile("a*b");
     * //通过正则对象的matcher方法字符串相关联。获取要对字符串操作的匹配器对象Matcher .
     * Matcher m = p.matcher("aaaaab");
     * //通过Matcher匹配器对象的方法对字符串进行操作。
     * boolean b = m.matches();
     */
    public static void functionDemo_4() {
        String str = "da jia hao,ming tian bu fang jia!";
        String regx = "\\b[a-z]{3}\\b";
        //1. 将正则封装为对象
        Pattern p = Pattern.compile(regx);
        //2. 通过正则对象获取匹配器对象
        Matcher matcher = p.matcher(str);


        //使用match对象的方法来对字符串进行操作
        //既然要获取三个字母组成的单词
        //查找

        while (matcher.find()) {
//            System.out.println(matcher.group()); //获取匹配的子序列
            System.out.println(matcher.start() + ":" + matcher.end()); //每个字段的起始位置

        }


    }

    /*
     * 替换   replaceAll:正则    replace ：字符    都是全部替换
     */
    public static void functionDemo_3() {
        String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
        str = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str);

        String tel = "15800001111";
        tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println(tel);
    }

    /*
     *切割 演示
     */
    public static void functionDemo_2() {
        String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
        String[] names = str.split("(.)\\1+");
        for (String name : names) {
            System.out.println(name);
        }

    }


    /*
     *匹配 演示
     */
    public static void functionDemo_1() {
        //匹配手机号码是否正确
        String tel = "18522302639";
        String regex = "1[358]\\d{9}";
        boolean matches = tel.matches(regex);
             /*
                     Pattern p = Pattern.compile(regex);
                    Matcher matcher = p.matcher(tel);
                    boolean matches = matcher.matches();

              */
        System.out.println(matches);
    }

}
