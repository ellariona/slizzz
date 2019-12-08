package ru.ssau.tk.prals.slizzz.part1.Point;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
