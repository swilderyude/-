package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo5StreamMatch {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        // list.stream()获取流，使用流遍历
        list.stream().forEach(System.out::println);
        // 过滤出所有确诊数在100以上的地区，匹配第一条
        System.out.println("确诊数在1000以上的地区");
        Disease disease = list.stream().filter(e -> e.getCount() > 1000).findFirst().get();
        System.out.println(disease);
        // 匹配是否所有地区确诊数都大于100
        boolean flag1 = list.stream().allMatch(e -> e.getCount() > 100);
        // 匹配是否存在一个确诊数大于1000的地区
        boolean flag2 = list.stream().anyMatch(e -> e.getCount() > 1000);
        // 匹配是否没有确诊数小于100的地区
        boolean flag3 = list.stream().noneMatch(e -> e.getCount() < 100);
        System.out.println(flag1 + "," + flag2 + "," + flag3);
    }
}
