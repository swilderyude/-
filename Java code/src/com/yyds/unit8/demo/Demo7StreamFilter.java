package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo7StreamFilter {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        // stream方法返回的数据类型是Stream，而Stream大部分方法返回的也是Stream，因此Stream可以进行链式编程
        // filter过滤出所有高风险地区，并直接输出
        list.stream().filter(e->e.getType() == 2).forEach(System.out::println);
        // filter过滤出所有低风险地区，并将名称收集成新的集合
        List<String> nameList = list.stream().filter(e -> e.getType() == 0).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("低风险地区有：" + nameList);
        // 过滤出确诊数不大于1000的地区，并匹配其中是否有中风险地区
        boolean flag = list.stream().filter(e -> e.getCount() <= 1000).anyMatch(e -> e.getType() == 1);
        System.out.println("匹配结果：" + flag);
    }
}
