package com.yyds.unit3.demo;

public class Demo3Add {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 18;
        add(student);
        System.out.println("加1后student的年龄为：" + student.age);
        int num = 18;
        System.out.println("加1后的num值为：" + num);
    }
    public static void add(int num) {
        num++;
    }
    public static void add(Student student) {
        student.age++;
    }
}
