package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo33Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 三个班级，应该创建一个长度为3的数组。每个班级有多个学生，因此数组中元素也是数组
        double[][] classes = new double[3][];
        classes[0] = new double[3];
        classes[1] = new double[4];
        classes[2] = new double[5];
        for (int i = 0; i < classes.length; i++) {
            // 获取班级
            double[] clazz = classes[i];
            for (int j = 0; j < clazz.length; j++) {
                System.out.print("请输入第" + (i + 1) + "班第" + (j + 1) + "名学生成绩：");
                clazz[j] = sc.nextDouble();
            }
        }
        // 计算每个班平均成绩
        for (int i = 0; i < classes.length; i++) {
            double[] clazz = classes[i];
            double sum = 0;
            for (double score : clazz) {
                sum += score;
            }
            System.out.println("第" + (i + 1) + "班平均分为：" + (sum / clazz.length));
        }
    }
}
