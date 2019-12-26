package ru.ssau.tk.prals.slizzz.preparationforthetest;

public class AreaRandomNumber implements RandomNumber {
    double left;
    double right;

    public AreaRandomNumber(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double randNumber() {
        if (left >= right) {
            throw new OutOfBoundsException("Error!");
        }

        return (Math.random() * (right - left) + left);


    }
}
