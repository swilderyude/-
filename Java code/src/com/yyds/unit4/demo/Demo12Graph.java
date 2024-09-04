package com.yyds.unit4.demo;
public class Demo12Graph {
    public static void main(String[] args) {
        Graph triangle = new Triangle(3,4,5);
        Graph square = new Square(10, 20);
        Graph circle = new Circle(3);
        triangle.showPerimeter();
        square.showPerimeter();
        circle.showPerimeter();
    }
}
