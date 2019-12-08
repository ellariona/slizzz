package ru.ssau.tk.prals.slizzz.part1.Point;


public class Point {
    //Task 3
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Task 6
    public double length() {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0) + Math.pow(z, 2.0));
    }
}
