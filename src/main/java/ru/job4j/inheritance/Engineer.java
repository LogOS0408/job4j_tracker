package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experienc;

    public Engineer(int experienc, boolean degree) {
        super(degree);
        this.experienc = experienc;
    }
}