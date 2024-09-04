package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1Collection {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("123");
        collection.add("abc");
        collection.add("helloworld");
        System.out.println(collection.size() + "," + collection.isEmpty() + collection);
        Collection collection2 = new ArrayList();
        collection2.add("张三");
        collection2.add("李四");
        collection2.add("王五");
        collection.addAll(collection2);
        System.out.println(collection.size() + "," + collection.isEmpty() + collection);
        collection.remove("李四");
        System.out.println(collection.size() + "," + collection.isEmpty() + collection);
        collection.removeAll(collection2);
        System.out.println(collection.size() + "," + collection.isEmpty() + collection);
    }
}
