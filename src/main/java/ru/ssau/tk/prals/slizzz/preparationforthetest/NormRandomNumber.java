package ru.ssau.tk.prals.slizzz.preparationforthetest;

public class NormRandomNumber implements RandomNumber {
    @Override
    public double randNumber() {
        return Math.random();
    }
}
