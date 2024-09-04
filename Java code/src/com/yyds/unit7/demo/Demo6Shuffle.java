package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo6Shuffle {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("J");
        list.add("Q");
        list.add("K");
        System.out.println("洗牌前：" + list);
        Collections.shuffle(list);
        System.out.println("洗牌后：" + list);
        Collections.shuffle(list);
        System.out.println("第二次洗牌：" + list);
    }
}
