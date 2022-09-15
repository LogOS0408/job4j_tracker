package ru.job4j.oop;

public class Computer1 {

    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public Computer1() {

    }

    public Computer1(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer1(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer1 first = new Computer1();
        first.printInfo();
        Computer1 second = new Computer1(true, 500, "Intel Core I7-10700K");
        second.printInfo();
    }
}
