package com.yyds.unit4.demo;
public class Demo2Extends {
    public static void main(String[] args) {
        People people = new People();
        people.setName("张三");
        people.setAge(23);
        people.eat();
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(24);
        // teacher继承了people，因此拥有people的所有方法
        teacher.eat();
        // 除此之外，teacher还有自己独有的方法
        teacher.teach();
        Worker worker = new Worker();
        worker.setName("王五");
        worker.setAge(25);
        worker.eat();
        worker.work();
    }
}
