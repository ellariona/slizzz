package ru.ssau.tk.prals.slizzz.part2;

public class Matrix {
    private double[][] matrix;
    private final int rows;
    private final int columns;

    Matrix() {
        rows = 0;
        columns = 0;
        matrix = new double[rows][columns];
    }

    Matrix(double[][] matrix) {
        rows = matrix.length;
        columns = matrix[0].length;
        this.matrix = matrix;
    }

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new double[rows][columns];
    }

    int getRows() {
        return rows;
    }

    int getColumns() {
        return columns;
    }

    double getAt(int n, int m) {
        return matrix[n][m];
    }

    void setAt(int n, int m, double value) {
        matrix[n][m] = value;
    }
}
