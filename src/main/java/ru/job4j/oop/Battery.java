package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery phone) {
        phone.load = this.load + phone.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery charger = new Battery(10);
        Battery phone = new Battery(90);
        charger.exchange(phone);
        System.out.println(phone.load);
    }
}