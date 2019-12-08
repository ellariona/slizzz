package ru.ssau.tk.prals.slizzz.part1.Point;

public class Points {
    private static double accuracy = 0.00005;

    //Task 4
    public static Point sum(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
    }

    private Points() {
    }

    //Task 5
    public static Point enlarge(Point point, double number) {
        return new Point(point.x * number, point.y * number, point.z * number);
    }

    //Task 6
    public static double length(Point point) {
        return point.length();
    }

    //Task 7
    public static Point opposite(Point point) {
        return new Point(-point.x, -point.y, -point.z);
    }

    public static Point inverse(Point point) {
        return new Point(1 / point.x, 1 / point.y, 1 / point.z);
    }

    //Task 8
    public static double scalarProduct(Point firstPoint, Point secondPoint) {
        return firstPoint.x * secondPoint.x + firstPoint.y * secondPoint.y + firstPoint.z * secondPoint.z;
    }

    public static Point vectorProduct(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.y * secondPoint.z - firstPoint.z * secondPoint.y, firstPoint.z * secondPoint.x - firstPoint.x * secondPoint.z, firstPoint.x * secondPoint.y - firstPoint.y * secondPoint.x);
    }

    //Task 1.12
    private static boolean equalsApproximately(double first, double second) {
        return Math.abs(first - second) < accuracy;
    }

    static boolean equalsApproximately(Point first, Point second) {
        return equalsApproximately(first.x, second.x) && equalsApproximately(first.y, second.y) && equalsApproximately(first.z, second.z);
    }
}
