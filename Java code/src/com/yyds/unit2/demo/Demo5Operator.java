package com.yyds.unit2.demo;
public class Demo5Operator {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
        // ++会先输出7，然后再将num+1，因此下一行是8
        System.out.println("num1++："+num1++);
        System.out.println("num1++之后："+num1);
        // -- 会先-1，然后再输出
        System.out.println("--num2："+--num2);
        System.out.println("--num2之后："+ num2);

    }
}
