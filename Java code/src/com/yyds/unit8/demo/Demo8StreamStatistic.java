package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo8StreamStatistic {
    public static void main(String[] args) {
        List<Disease> list = new ArrayList<>();
        list.add(new Disease(1, "安徽合肥", 100, 0));
        list.add(new Disease(2, "湖北武汉", 2000, 2));
        list.add(new Disease(3, "上海浦东", 1500, 2));
        list.add(new Disease(4, "河南郑州", 500, 1));
        list.add(new Disease(5, "江苏南京", 200, 0));
        // 计算出确诊数最少的城市
        Disease min = list.stream().min((a, b) -> a.getCount() - b.getCount()).get();
        // 计算出确诊数最多的城市
        Disease max = list.stream().max((a, b) -> a.getCount() - b.getCount()).get();
        // 计算出中风险地区及以上的城市个数
        long count = list.stream().filter(e -> e.getType() > 0).count();
        System.out.println("确诊数最少：" + min);
        System.out.println("确诊数最大：" + max);
        System.out.println("中高风险地区个数：" + count);
    }
}
