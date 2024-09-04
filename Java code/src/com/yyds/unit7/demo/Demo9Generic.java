package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo9Generic {
    public static void main(String[] args) {
        // 指定List只能存储String类型。前面指定之后，后面可以不写
        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("Go");
        list.add("Java");
        list.add("C");
        list.add("PHP");
        // list.add(123); // 报错
        // 输出所有长度在3以上的元素
        // 这里遍历直接可以定义成String，因为集合只能存String
        for (String o : list) {
            // 在实际开发中我们可能不知道集合中存储了非字符串，这里就会抛出异常
            if(o.length() >= 3) {
                System.out.println(o);
            }
        }
    }
}
