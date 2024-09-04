package com.yyds.unit3.demo;
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point p) {
        double xLen = this.x - p.x;
        double yLen = this.y - p.y;
        return Math.sqrt(xLen*xLen+yLen*yLen);
    }
}
