package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6StreamMap {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        // map取出所有地区信息，collect将这些地区信息合并成新的集合
        List<String> areaList = list.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("所有疫情地区：" + areaList);
    }
}
