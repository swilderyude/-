package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo12Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算表达式：数字与符号之间使用空格隔开");
        int num1 = sc.nextInt();
        // 输入字符串，取第一个字符，暂时理解成固定写法即可，我们将在常用类这一章介绍该方法
        char operator = sc.next().charAt(0);
        int num2 = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("运算符号不合法！");
                break;
        }
    }
}
