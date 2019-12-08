package ru.ssau.tk.prals.slizzz.part1.Point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTests {
    Point firstPoint = new Point(1, 2, 3);
    Point secondPoint = new Point(1.6, 3.1, 5.6);
    Point thirdPoint = new Point(2.9, 3, 3.9);

    @Test
    void checkClass() {
        assertEquals(secondPoint.length(), Math.sqrt(1.6 * 1.6 + 3.1 * 3.1 + 5.6 * 5.6), 0.001);
        assertEquals(thirdPoint.length(), Math.sqrt(2.9 * 2.9 + 3 * 3 + 3.9 * 3.9), 0.001);
    }
}
