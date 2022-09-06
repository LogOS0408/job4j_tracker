package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    private int divide(int a) {
        return x / a;
    }

    public int sumAllOperation(int c) {
        int total = divide(c) + sum(c) + minus(c) + multiply(c);
        return total;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return x - z;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5));
        int difference = minus(2);
        System.out.println(difference);
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.divide(1));
        Calculator total = new Calculator();
        System.out.println(total.sumAllOperation(1));

    }
}