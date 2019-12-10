package ru.ssau.tk.prals.slizzz.part2;

public class SomeArray {
    //Task 1
    public static int[] createSomeArray1(int length) {
        return new int[length];
    }

    //Task 2
    public static int[] createSomeArray2(int length) {
        int[] someArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1) {
                someArray[i] = 2;
            } else {
                someArray[i] = 1;
            }
        }
        return someArray;
    }

    //Task 3
    public static int[] createSomeArrayRisingOdd(int length) {
        int[] someArray = new int[length];
        for (int i = 1; i <= length; i++) {
            someArray[i - 1] = 2 * i - 1;
        }
        return someArray;
    }

    //Task 4
    public static int[] createSomeArrayDownEven(int length) {
        int[] someArray = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            someArray[i] = 2 * (length - i);
        }
        return someArray;
    }

    //Task 5
    public static int[] createSomeArrayFibonacci(int length) {
        int[] someArray = new int[length];
        int a = 0, b = 1, next;
        for (int i = 0; i < length; i++) {
            next = a + b;
            a = b;
            b = next;
            someArray[i] = next;
        }
        return someArray;
    }

    //Task 6
    public static int[] createSomeArraySquareIndex(int length) {
        int[] someArray = new int[length];
        for (int i = 0; i < length; i++) {
            someArray[i] = i * i;
        }
        return someArray;
    }

    //Task 7
    public static double[] createSomeArraySquareEquation(double a, double b, double c) {
        double v = b * b - 4 * a * c;
        if (v > 0) {
            double x1 = (-b + Math.sqrt(v)) / (2 * a);
            double x2 = (-b - Math.sqrt(v)) / (2 * a);
            double[] someArray = new double[2];
            someArray[0] = x1;
            someArray[1] = x2;
            return someArray;
        }
        if (v == 0) {
            double x = (-b) / (2 * a);
            double[] someArray = new double[1];
            someArray[0] = x;
            return someArray;
        }
        return new double[0];
    }

    //Task 8
    public static int[] createSomeArrayNaturalNumber(int length) {
        int[] someArray = new int[length];
        int num = 1;
        for (int i = 0; i < length; i++) {
            if (num % 3 == 0) {
                num++;
            }
            someArray[i] = num;
            num++;
        }
        return someArray;
    }

    //Task9
    public static double[] createSomeArrayArithmeticProgression(int length, int firstElement, int difference) {
        double[] someArray = new double[length];
        someArray[0] = firstElement;
        for (int i = 1; i < length; i++) {
            someArray[i] = someArray[i - 1] + difference;
        }
        return someArray;
    }

    //Task10
    public static double[] createSomeArrayGeometricProgression(int length, int firstElement, int factor) {
        double[] someArray = new double[length];
        someArray[0] = firstElement;
        for (int i = 1; i < length; i++) {
            someArray[i] = someArray[i - 1] * factor;
        }
        return someArray;
    }
}
