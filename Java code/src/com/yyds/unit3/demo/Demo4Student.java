package com.yyds.unit3.demo;

public class Demo4Student {
    public static void main(String[] args) {
        //直接传一个对象进去即可，并不需要创建变量接收
        invokeMethod(new Student());
    }
    public static void invokeMethod(Student student) {
        student.study();
        student.eat("饼干");
    }
}
