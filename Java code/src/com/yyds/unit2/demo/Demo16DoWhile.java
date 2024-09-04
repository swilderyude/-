package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo16DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        do {
            System.out.print("请输入用户名：");
            username = sc.next();
            System.out.print("请输入密码：");
            password = sc.next();
            // 字符串判断相等要使用equals
        }while (!"admin".equals(username) || !"123456".equals(password));
        System.out.println("登录成功");
    }
}
