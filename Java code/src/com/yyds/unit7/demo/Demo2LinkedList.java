package com.yyds.unit7.demo;

import java.util.LinkedList;

public class Demo2LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        // 向头部添加元素
        list.addFirst("赵六");
        System.out.println(list);
        // 删除尾部元素
        list.removeLast();
        System.out.println(list);
        // 删除并获取尾部元素
        Object o = list.pollLast();
        System.out.println(o);
        System.out.println(list);
    }
}
