package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo15Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        list.add("Python");
        list.add("VB");
        list.add("PHP");
        Iterator<String> iterator = list.iterator();
        // 只要有下一个元素，就继续迭代
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(next.length() < 3) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
