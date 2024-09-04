package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo20Disease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入地区确诊数：");
        int num = sc.nextInt();
        String level = getLevel(num);
        System.out.println("该地区为" + level + "区");
    }

    public static String getLevel(int num) {
        if (num <= 100) {
            return "低风险";
        } else if (num > 100 && num <= 1000) {
            return "中风险";
        } else {
            return "高风险";
        }
    }
}
