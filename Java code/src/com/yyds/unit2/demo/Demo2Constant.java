package com.yyds.unit2.demo;
public class Demo2Constant {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        // 再次赋值编译不通过
//        PI = 3.14;
        System.out.println(PI);
    }
}
