package com.yyds.unit13.demo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo7Generics {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        // 使用反射机制添加数据
        Class<? extends List> listClass = list.getClass();
        Method method = listClass.getDeclaredMethod("add", Object.class);
        method.invoke(list, "Hello");
        method.invoke(list, "World");
        System.out.println(list);
    }
}
