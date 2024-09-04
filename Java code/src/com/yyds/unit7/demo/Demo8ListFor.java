package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo8ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Python");
        list.add("Go");
        list.add("Java");
        list.add("C");
        list.add("PHP");
        list.add(123);
        // 输出所有长度在3以上的元素
        for (Object o : list) {
            // 在实际开发中我们可能不知道集合中存储了非字符串，这里就会抛出异常
            String s = (String) o;
            if(s.length() >= 3) {
                System.out.println(s);
            }
        }
    }
}
