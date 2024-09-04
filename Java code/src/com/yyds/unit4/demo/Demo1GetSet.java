package com.yyds.unit4.demo;
public class Demo1GetSet {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(-20);
        System.out.println("student1的年龄为：" + student1.getAge());
        Student student2 = new Student();
        student2.setAge(30);
        System.out.println("student2的年龄为：" + student2.getAge());
    }
}
