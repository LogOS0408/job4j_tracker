package ru.job4j.oop;

public class Cats {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cats gav = new Cats();
        gav.giveNick("Gav.");
        gav.eat("Kotleta.");
        gav.show();
        System.out.println("There are Gav's food.");
        Cats black = new Cats();
        black.giveNick("Mr.Black.");
        black.eat("Fish.");
        black.show();
        System.out.println("There are Mr.Black's food.");
    }
}