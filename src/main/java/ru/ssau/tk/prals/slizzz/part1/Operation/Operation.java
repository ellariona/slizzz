package ru.ssau.tk.prals.slizzz.part1.Operation;

public abstract class Operation {
    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
