package com.yyds.unit4.demo;
public class Demo5ToString {
    public static void main(String[] args) {
        People people = new People();
        people.setName("张三");
        people.setAge(23);
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(24);
        Worker worker = new Worker();
        worker.setName("王五");
        worker.setAge(25);
        String peopleStr = people.toString();
        System.out.println(peopleStr);
        System.out.println(teacher.toString());
        System.out.println(worker);
    }
}
