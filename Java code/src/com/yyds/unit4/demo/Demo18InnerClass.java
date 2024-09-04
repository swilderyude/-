package com.yyds.unit4.demo;
public class Demo18InnerClass {
    public static void main(String[] args) {
        OuterClass2 outerClass = new OuterClass2();
        outerClass.setName("张三");
        OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();
        innerClass.setName("李四");
        outerClass.setInnerClass(innerClass);
        outerClass.test();
        innerClass.test();
    }
}
