package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo9StreamReduce {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        // 分别计算高风险地区总人数、中风险地区总人数、低风险地区总人数
        Integer highCount = list.stream().filter(e -> e.getType() == 2)
                // 只取出count进行计算
                .map(e -> e.getCount()).reduce((a, b) -> a + b).get();
        // 这里使用方法引用
        Integer middleCount = list.stream().filter(e -> e.getType() == 1).map(Disease::getCount).reduce(Integer::sum).get();
        Integer lowCount = list.stream().filter(e -> e.getType() == 0).map(e -> e.getCount()).reduce(Integer::sum).get();
        System.out.println("高风险、中风险、低风险地区人数分别为：" + highCount + "," + middleCount + "," + lowCount);
    }
}
