package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo11If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        double score = scanner.nextDouble();
        if (score > 100) {
            System.out.println("分数不合法");
        } else if (score >= 90 && score <= 100) {
            System.out.println("学生分数为：" + score + "，评分为优秀");
        } else if (score >= 70 && score < 90) {
            System.out.println("学生分数为：" + score + "，评分为良好");
        } else if (score >= 60 && score < 70) {
            System.out.println("学生分数为：" + score + "，评分为及格");
        } else {
            System.out.println("学生分数为：" + score + "，评分不及格");
        }
    }
}
