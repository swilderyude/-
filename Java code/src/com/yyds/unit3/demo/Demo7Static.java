package com.yyds.unit3.demo;

public class Demo7Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.grade = "软件1班";
        System.out.println("s1的grade值：" + s1.grade);
        System.out.println("s2的grade值：" + s2.grade);
        System.out.println("使用类名取grade值：" + Student.grade);
    }
}
