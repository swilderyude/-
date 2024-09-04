package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo23LinkedHashSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Java", "PHP", "C++", "PHP");
        System.out.println("list集合：" + list);
        // 创建LinkedHashSet
        Set<String> set = new LinkedHashSet<>();
        // 将list中所有元素添加到set中
        set.addAll(list);
        System.out.println("set集合：" + set);
        // 创建新的List
        List<String> list1 = new ArrayList<>(set);
        System.out.println("去重后List：" + list1);
    }
}
