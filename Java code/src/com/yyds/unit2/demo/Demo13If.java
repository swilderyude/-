package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo13If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            if (year % 100 != 0 && year % 4 == 0) {
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        }
    }
}
