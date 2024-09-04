package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo7Reverse {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("反转前：" + list);
        Collections.reverse(list);
        System.out.println("反转后：" + list);
    }
}
