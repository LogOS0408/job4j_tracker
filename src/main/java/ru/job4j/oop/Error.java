package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Наличие ошибки " + active);
        System.out.println("Номер ошибки " + status);
        System.out.println("Статус ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error404 = new Error(true, 404, "Не критическая");
        error404.print();
        Error error505 = new Error(true, 505, "Не критическая");
        error505.print();
        Error critical = new Error(true, 530975356, "Критическая");
        critical.print();
        Error empty = new Error();
        empty.print();
    }
}