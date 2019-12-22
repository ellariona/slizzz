package ru.ssau.tk.prals.slizzz.part2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {
    private Matrix first = new Matrix(new double[][]{{1, 2}, {3, 4}});
    private Matrix second = new Matrix(new double[][]{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}});
    private Matrix third = new Matrix(new double[][]{{1, 2}, {2, 3}});
    Matrix four = new Matrix(new double[][]{{1, 2}, {2, 3}, {5, 6}});

    @Test
    public void testSumMatrix() {
        assertNull(Matrices.sumMatrix(first, second));
        Matrix result = Matrices.sumMatrix(first, third);
        assert result != null;
        assertEquals(result.getAt(0, 0), 2, 0.001);
        assertEquals(result.getAt(1, 1), 7, 0.001);
        assertEquals(first.getAt(0, 0), 1, 0.001);
    }
}