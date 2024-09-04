package com.yyds.unit7.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo17MapIterator {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("安徽", 1000);
        map.put("湖北", 3000);
        map.put("上海", 3000);
        map.put("北京", 2000);
        map.put("河南", 1000);
        System.out.println("keySet方式遍历");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("entrySet方式遍历");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
