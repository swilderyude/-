package com.yyds.unit2.demo;
public class Demo6Operator {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        System.out.println("交换前：num1="+num1+",num2="+num2);
        // 借助临时变量交换
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("交换后：num1="+num1+",num2="+num2);
        num1 += 2;
        num2 += 2;
        System.out.println("加2后：num1="+num1+",num2="+num2);
    }
}
