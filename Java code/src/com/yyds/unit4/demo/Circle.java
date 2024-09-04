package com.yyds.unit4.demo;
public class Circle extends Graph {
    private double radius;

    public Circle(double radius) {
        super("圆形");
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return radius * 2 * 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
