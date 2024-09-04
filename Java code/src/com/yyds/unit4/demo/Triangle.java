package com.yyds.unit4.demo;
public class Triangle extends Graph {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super("三角形");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
