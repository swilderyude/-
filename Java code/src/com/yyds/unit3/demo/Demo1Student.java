package com.yyds.unit3.demo;

public class Demo1Student {
    public static void main(String[] args) {
        // 有点像在创建变量，实际上student1这个对象名称就可以理解成变量
        Student student1 = new Student();
        // 使用对象名.成员变量名操作变量
        student1.age = 18;
        student1.name = "张三";
        // 使用对象名.成员方法名调用方法
        student1.study();
        // 中再创建一个对象
        Student student2 = new Student();
        student2.name = "李四";
        student2.age = 24;
        student2.eat("饼干");
    }
}
