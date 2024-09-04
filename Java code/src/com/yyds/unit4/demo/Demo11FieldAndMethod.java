package com.yyds.unit4.demo;
public class Demo11FieldAndMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "张三";
        // 向上转型
        Parent parent = child;
        parent.name = "李四";
        System.out.println("parent.name=" + parent.name);
        System.out.println("child.name=" + child.name);
        parent.eat();
        parent.sleep();
        child.eat();
        child.sleep();
//        parent.cry();无法调用
    }
}

class Parent {
    // 为了简单起见，这里就将成员变量定义为public
    public String name;
    public void eat() {
        System.out.println("父类吃饭");
    }
    public static void sleep() {
        System.out.println("父类睡觉");
    }
}

class Child extends Parent {
    public int age;
    public String name;
    @Override
    public void eat() {
        System.out.println("子类吃饭");
    }
    public static void sleep() {
        System.out.println("子类睡觉");
    }
    public void cry() {
        System.out.println("子类哭泣");
    }
}
