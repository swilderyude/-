package com.yyds.unit4.demo;
public class Demo17InnerClass {
    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        outerClass1.setName("张三");
        OuterClass1.InnerClass innerClass = outerClass1.new InnerClass();
        innerClass.setName("李四");
        outerClass1.setInnerClass(innerClass);
        outerClass1.test();
        innerClass.test();
    }
}
