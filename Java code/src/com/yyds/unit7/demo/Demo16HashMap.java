package com.yyds.unit7.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo16HashMap {
    public static void main(String[] args) {
        // 创建一个key是String，value是Integer的HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);
        map.put("田七", 27);
        // 根据key获取value
        Integer age = map.get("李四");
        System.out.println("李四的年龄是：" + age);
        // 判断map中是否有指定的key
        boolean flag1 = map.containsKey("九妹");
        // 判断map中是否有指定的value
        boolean flag2 = map.containsValue(23);
        System.out.println("containsKey：" + flag1);
        System.out.println("containsValue：" + flag2);
        // 获取所有的key
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // 获取所有value
        Collection<Integer> values = map.values();
        System.out.println(values);
    }
}
