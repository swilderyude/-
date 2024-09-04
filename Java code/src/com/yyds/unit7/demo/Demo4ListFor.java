package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo4ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        // 遍历长度，通过索引获取
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=============");
        // for-each循环
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
