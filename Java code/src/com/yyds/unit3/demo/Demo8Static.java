package com.yyds.unit3.demo;

public class Demo8Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.goHome();
        s2.goHome();
        Student.goHome();
    }
}
