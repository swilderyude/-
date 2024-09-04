package com.yyds.unit7.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo22HashSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Java", "PHP", "C++", "PHP");
        System.out.println("list集合：" + list);
        // 创建hashSet
        Set<String> set = new HashSet<>();
        // 将list中所有元素添加到set中
        set.addAll(list);
        System.out.println("set集合：" + set);
    }
}
