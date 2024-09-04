package com.yyds.unit3.demo;

public class Demo6This {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(6, 1);
        double length = p1.calcLength(p2);
        System.out.println("两个坐标的距离为：" + length);
    }
}
