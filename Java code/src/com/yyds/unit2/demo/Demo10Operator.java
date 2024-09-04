package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo10Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num1 = scanner.nextInt();
        System.out.print("请再输入一个数字：");
        int num2 = scanner.nextInt();
        // 计算较大值，如果num1比num2大，则num1为较大值，否则num2为较大值
        int max = num1 > num2 ? num1 : num2;
        System.out.println("num1和num2较大值为：" + max);
    }
}
