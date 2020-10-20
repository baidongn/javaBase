package com.example.demo.regex;

import java.util.TreeSet;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:24 2020/10/20
 */
public class RegexTest {
    public static void main(String[] args) {
        /*
         * 1，治疗口吃:我我...我我...我我我要...要要要要...要要要要..学学学学学...学学编编...
         * 编编编编..编..程程...程程...程程程
         * 2，对ip地址排序。
         * 3，对邮件地址校验。
         */
        test_3();
    }

    //对邮件地址校验。
    public static void test_3() {
        String mail = "abc1@sina.com.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
        regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
        boolean b = mail.matches(regex);
        System.out.println(mail + ":" + b);
    }

    /*
     *ip地址排序   抽取 匹配中对应的值，用 （）  --  $1
     */
    public static void test_2() {
        String ip_str = "192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55";
        //1,为了让ip可以按照字符串顺序比较，只要让ip的每一段的位数相同。
        //所以，补零，按照每一位所需做多0进行补充。每一段都加两个0
        ip_str = ip_str.replaceAll("(\\d+)", "00$1");
        System.out.println(ip_str);
        //然后每一段保留数字3位。（补全0，再将多余的0去掉）
        ip_str = ip_str.replaceAll("0*(\\d{3})", "$1");
        System.out.println(ip_str);

        //1，将ip地址切出。
        String[] ips = ip_str.split(" +");

        //排序
        TreeSet<String> ts = new TreeSet<String>();

        for (String ip : ips) {
            // System.out.println(ip);
            ts.add(ip);
        }

        for (String ip : ts) {
            System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
        }
    }

    /*
     * 治疗口吃
     */
    public static void test_1() {
        String str = "我我...我我...我我我要...要要要要...要要要要..学学学学学...学学编编...编编编编..编..程程...程程...程程程";

        //1.去掉 。
        str = str.replaceAll("\\.+", "");
        System.out.println(str);

        //2. 去掉叠词
        str = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str);
    }
}
