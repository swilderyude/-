package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5Sort {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        list.add("g");
        list.add("e");
        list.add("f");
        System.out.println("排序前：" + list);
        Collections.sort(list);
        System.out.println("排序后：" + list);
    }
}
