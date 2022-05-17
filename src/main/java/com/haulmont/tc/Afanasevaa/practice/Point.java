package com.haulmont.tc.Afanasevaa.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point pointA = new Point(2, 3, 5);
        Point pointB = new Point(4, 6, 8);

        Point sum = Points.sum(pointA, pointB);
        Point subtract = Points.subtract(pointA, pointB);
        Point multiply = Points.multiply(pointA, pointB);
        Point divide = Points.divide(pointA, pointB);

        Point pointC = new Point(7, 12, 16);
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(pointA.length());

    }

    public double length() {

        return Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));

    }
}
