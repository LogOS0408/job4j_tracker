package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Bear bear = new Bear();
        Fox fox = new Fox();
        Ball ball = new Ball();
        hare.tryEat(ball);
        bear.tryEat(ball);
        fox.tryEat(ball);
    }
}