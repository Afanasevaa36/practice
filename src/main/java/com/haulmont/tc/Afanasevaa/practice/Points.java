package com.haulmont.tc.Afanasevaa.practice;

public class Points {
    private Points(){
    }
    public static Point divide(Point divideFirstPoint, Point divideSecondPoint) {
        double x = divideFirstPoint.x / divideSecondPoint.x;
        double y = divideFirstPoint.y / divideSecondPoint.y;
        double z = divideFirstPoint.z / divideSecondPoint.z;
        return new Point(x, y, z);
    }

    public static Point multiply(Point multiplyFirstPoint, Point multiplySecondPoint) {
        double x = multiplyFirstPoint.x * multiplySecondPoint.x;
        double y = multiplyFirstPoint.y * multiplySecondPoint.y;
        double z = multiplyFirstPoint.z * multiplySecondPoint.z;
        return new Point(x, y, z);
    }

    public static Point subtract(Point subtractFirstPoint, Point subtractSecondPoint) {
        double x = subtractFirstPoint.x - subtractSecondPoint.x;
        double y = subtractFirstPoint.y - subtractSecondPoint.y;
        double z = subtractFirstPoint.z - subtractSecondPoint.z;
        return new Point(x, y, z);
    }

    public static Point sum(Point sumFirstPoint, Point sumSecondPoint) {
        double x = sumFirstPoint.x + sumSecondPoint.x;
        double y = sumFirstPoint.y + sumSecondPoint.y;
        double z = sumFirstPoint.z + sumSecondPoint.z;
        return new Point(x, y, z);
    }
    public static double length( Point point) {
    return point.length();
    }
}
