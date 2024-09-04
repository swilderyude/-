package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo11StreamSort {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        // 根据确诊数倒序排序
        List<Disease> list2 = list.stream().sorted((a, b) -> b.getCount() - a.getCount()).collect(Collectors.toList());
        System.out.println("倒序排序：");
        list2.forEach(System.out::println);
        // 根据风险度由低到高排序，相同风险度地区按照确诊人数从高到低排序
        List<Disease> list3 = list.stream().sorted(Comparator.comparing(Disease::getType).thenComparing((a, b) -> b.getCount() - a.getCount())).collect(Collectors.toList());
        System.out.println("按照风险度和人数排序");
        list3.forEach(System.out::println);
    }
}
