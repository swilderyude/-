package com.yyds.unit6.demo;

import java.util.Random;

public class Demo17Code {
    public static void main(String[] args) {
        Random random = new Random();
        // random不能直接获取[100000, 999999]的随机数
        // 但是可以获取[0, 899999]，即[0, 900000)之间的随机整数
        // 在这个基础上加上100000即得到想要的结果
        int code = random.nextInt(900000) + 100000;
        System.out.println("您的验证码为" + code + "，验证码10分钟内有效，请勿泄露给他人");
    }
}
