package com.yyds.unit7.demo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo21TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 - o2 < 0) {
                    return 1;
                } else if (o1 - o2 > 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        // 不按照顺序添加元素
        map.put(1000, "张三");
        map.put(985, "李四");
        map.put(996, "王五");
        map.put(1024, "赵六");
        map.put(10086, "田七");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
