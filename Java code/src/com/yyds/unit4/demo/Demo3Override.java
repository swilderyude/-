package com.yyds.unit4.demo;
public class Demo3Override {
    public static void main(String[] args) {
        People people = new People();
        people.setName("张三");
        people.setAge(23);
        people.eat();
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(24);
        teacher.eat();
        Worker worker = new Worker();
        worker.setName("王五");
        worker.setAge(25);
        worker.eat();
    }
}
