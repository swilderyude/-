package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo14ForRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        list.add("Python");
        list.add("VB");
        list.add("PHP");
        for (String s : list) {
            if(s.length() < 3) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
