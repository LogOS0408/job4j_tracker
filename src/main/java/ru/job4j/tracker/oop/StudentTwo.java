package ru.job4j.tracker.oop;

public class StudentTwo {

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public static void main(String[] args) {
        StudentTwo petya = new StudentTwo();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}