package ru.job4j.oop;

public class Calculator1 {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }
}
