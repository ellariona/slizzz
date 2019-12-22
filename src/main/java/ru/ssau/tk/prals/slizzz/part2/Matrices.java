package ru.ssau.tk.prals.slizzz.part2;

public class Matrices {
    static Matrix sumMatrix(Matrix first, Matrix second) {
        int rows = first.getRows();
        int columns = first.getColumns();
        if (rows == second.getRows() && columns == second.getColumns()) {
            Matrix result = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.setAt(i, j, first.getAt(i, j) + second.getAt(i, j));
                }
            }
            return result;
        }
        return null;
    }
}
