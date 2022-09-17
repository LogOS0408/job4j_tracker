package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLand;

    public Programmer(String programLand, int experienc, boolean degree) {
        super(experienc, degree);
        this.programLand = programLand;
    }
}