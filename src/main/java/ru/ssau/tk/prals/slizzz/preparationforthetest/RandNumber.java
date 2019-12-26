package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandNumber {
    private int length;
    RandomNumber randomNumber;

    public RandNumber(int length, RandomNumber randomNumber) {
        this.length = length;
        this.randomNumber = randomNumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public RandomNumber getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(RandomNumber randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void process(RandomNumber strategy) {
        strategy.randNumber();
    }

}
