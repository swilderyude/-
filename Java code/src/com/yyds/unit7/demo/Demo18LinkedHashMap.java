package com.yyds.unit7.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo18LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("安徽", 1000);
        map.put("湖北", 3000);
        map.put("上海", 3000);
        map.put("北京", 2000);
        map.put("河南", 1000);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
