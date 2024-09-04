package com.yyds.unit8.demo;
@FunctionalInterface
public interface MyInterface {
    void accept();
    // 尽管有多个方法，但method1不是必须被实现的方法，因而满足函数式接口的定义
    default void method1() {
        System.out.println("我是默认的方法1");
    }
}
