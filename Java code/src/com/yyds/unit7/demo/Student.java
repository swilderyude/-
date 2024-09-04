package com.yyds.unit7.demo;
public class Student implements Comparable<Student>{
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 根据年龄顺序排序
        if(this.age - o.age < 0) {
            return -1;
        }else if(this.age - o.age > 0) {
            return 1;
        }else {
            return 0;
        }
    }
}
