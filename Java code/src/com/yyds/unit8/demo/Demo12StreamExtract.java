package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo12StreamExtract {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        list.add(new Disease(6, "江苏南京", 300, 0));
        list.add(new Disease(7, "河南郑州", 100, 0));
        // 取出所有低风险地区，并将名称去重
        List<String> names = list.stream().filter(e -> e.getType() == 0).map(Disease::getName).distinct().collect(Collectors.toList());
        System.out.println("低风险地区有：" + names);
        // 根据确诊数倒序排序，取前两个城市
        List<Disease> top2List = list.stream().sorted(Comparator.comparing(Disease::getCount).reversed()).limit(2).collect(Collectors.toList());
        System.out.println("确诊数最多的2个城市");
        top2List.forEach(System.out::println);
        // 根据确诊数倒序排序，跳过前3条数据
        List<Disease> skip3List = list.stream().sorted((a, b) -> b.getCount() - a.getCount()).skip(3).collect(Collectors.toList());
        System.out.println("跳过前3条");
        skip3List.forEach(System.out::println);
    }
}
