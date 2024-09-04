package com.yyds.unit4.demo;

public abstract class Graph {
    private String name;

    public Graph(String name) {
        this.name = name;
    }

    public abstract double calcPerimeter();

    public void showPerimeter() {
        double perimeter = calcPerimeter();
        System.out.println(getName() + "的周长为：" + perimeter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
