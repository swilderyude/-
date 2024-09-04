package com.yyds.unit7.demo;

import java.util.Map;
import java.util.TreeMap;

public class Demo20TreeMap {
    public static void main(String[] args) {
        Map<Student, String> map = new TreeMap<>();
        map.put(new Student(23, "张三"), "河南南阳");
        map.put(new Student(26, "赵六"), "安徽宿州");
        map.put(new Student(25, "王五"), "四川成都");
        map.put(new Student(21, "丁一"), "江苏南京");
        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
