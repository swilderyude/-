package com.yyds.unit3.demo;

// 其他包下的类使用需要导包
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo10Package {
    public static void main(String[] args) {
        // java.lang包下，省略导包
        String s = "HelloWorld";
        // Student与本类在一个包下，省略导包
        Student student = new Student();
        // 其他包下的类使用需要导包
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        // 如果使用到了同名的两个类，其中一个必须用全类名的方式访问
        java.awt.List list1 = new java.awt.List();
    }
}
