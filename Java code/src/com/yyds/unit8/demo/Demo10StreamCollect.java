package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo10StreamCollect {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        System.out.println("收集：");
        // 获取所有高风险地区，收集成map，地区名称为key，确诊数为value
        Map<String, Integer> highMap = list.stream().filter(e -> e.getType() == 2).collect(Collectors.toMap(Disease::getName, Disease::getCount));
        System.out.println(highMap);
        System.out.println("===================");
        System.out.println("统计：");
        // 统计高风险地区个数
        Long highAreaCount = list.stream().filter(e -> e.getType() == 2).collect(Collectors.counting());
        // 统计中低风险地区平均人数
        Double avg = list.stream().filter(e -> e.getType() != 2).collect(Collectors.averagingInt(Disease::getCount));
        // 求低风险地区总人数
        Integer totalCount = list.stream().filter(e -> e.getType() == 0).collect(Collectors.summingInt(Disease::getCount));
        // 求确诊数最多的城市
        Optional<Disease> max = list.stream().collect(Collectors.maxBy((a, b) -> a.getCount() - b.getCount()));
        // 一次性统计中高风险地区个数、平均人数、总人数、确诊数最多、最少的城市
        IntSummaryStatistics statistics = list.stream().filter(e -> e.getType() != 0).collect(Collectors.summarizingInt(Disease::getCount));
        System.out.println("高风险地区个数：" + highAreaCount);
        System.out.println("中低风险地区平均人数：" + avg);
        System.out.println("低风险地区总人数：" + totalCount);
        System.out.println("确诊数最多城市：" + max);
        System.out.println("高风险地区体检结果：");
        System.out.println(statistics);
        System.out.println("====================");
        // 将城市以确诊数500为分界点，分成两组
        Map<Boolean, List<Disease>> map1 = list.stream().collect(Collectors.partitioningBy(e -> e.getCount() >= 500));
        System.out.println("500分界点分组：");
        for (Map.Entry<Boolean, List<Disease>> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+":");
            entry.getValue().forEach(System.out::println);
        }
        // 将城市按照风险度分组
        Map<Integer, List<Disease>> map2 = list.stream().collect(Collectors.groupingBy(Disease::getType));
        System.out.println("按照风险度分组：");
        for (Map.Entry<Integer, List<Disease>> entry : map2.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(System.out::println);
        }
        System.out.println("=============");
        System.out.println("接合：");
        // 将高风险地区名称使用 , 连接起来
        String names = list.stream().filter(e -> e.getType() == 2).map(Disease::getName).collect(Collectors.joining(","));
        System.out.println(names);
    }
}
