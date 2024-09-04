package com.yyds.unit4.demo;

public class Square extends Graph{
    private double width;
    private double height;

    public Square(double width, double height) {
        super("矩形");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcPerimeter() {
        return (width + height) * 2;
    }
}
