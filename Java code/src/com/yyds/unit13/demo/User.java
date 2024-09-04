package com.yyds.unit13.demo;
@MyAnnotation(id = 1, msg = "用户")
@TypeTag
public class User {
    @Id
    private Integer id;
    private String name;
    public Integer age;

    public User() {
    }

    private User(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("睡觉");
    }
    private void eat() {
        System.out.println("吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
