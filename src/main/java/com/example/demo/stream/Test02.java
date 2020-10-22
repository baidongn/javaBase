package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author： bd
 * @Description:   映射
 *
 * map：接收 Lambda ，将元素转换为其他形式或提取信息；接受一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素
 * flatMap：接收一个函数作为参数，将流中每一个值都换成另一个流，然后把所有流重新连接成一个流
 * @Date: Created in 14:52 2020/10/22
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("asdfs", "bfsadfs", "csadfsaf");

        //map   add（）
        list.stream().map(x ->  x.toUpperCase())
                .forEach(System.out::println);

        //flatMap  重新包装成原来的流，再将流连接   addAll（）
        Test02 test02 = new Test02();
        list.stream()
                .flatMap(test02::filterCharacter)
                .forEach(System.out::println);

    }


    public Stream<String> filterCharacter(String str) {
        List<String> list = new ArrayList<>();
        list.add(str.toUpperCase());
        return list.stream();

    }

    //单个字符
    public Stream<Character> filterCharacter1(String str){
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        return list.stream();
    }
}
