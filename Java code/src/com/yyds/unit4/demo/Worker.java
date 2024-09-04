package com.yyds.unit4.demo;

public class Worker extends People {
    public void work() {
        System.out.println(getAge() + "岁的" + getName() + "正在工作");
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "工人正在工地吃饭");
    }

}
