package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo22Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的位数：");
        int num = scanner.nextInt();
        int fib = fib(num);
        System.out.println("斐波那契数列中第" + num + "位数字为：" + fib);
    }

    public static int fib(int n) {
        // 前两个比较特殊，直接返回即可
        if (n == 1 || n == 2) {
            return 1;
        } else {
            // 之后的位置都满足F(n)=F(n - 1)+F(n - 2)，调用本身即可
            return fib(n - 1) + fib(n - 2);
        }
    }
}
