package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo19Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形三条边");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isTriangle(a, b, c);
    }

    public static void isTriangle(int a, int b, int c) {
        // 构成三角形要素：任意两个边之和大于第三条边
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(a + "," + b + "," + c + "能够构成三角形，周长为：" + (a + b + c));
        } else {
            System.out.println(a + "," + b + "," + c + "不能够构成三角形");
        }
    }
}
