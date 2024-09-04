package com.yyds.unit4.demo;

public class Student {
    // private修饰，让其他类无法直接操作变量
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 通过set方法获取值，并在这里处理age的范围
        if(age < 0) {
            age = 0;
        }
        if(age > 200) {
            age = 200;
        }
        this.age = age;
    }
}
