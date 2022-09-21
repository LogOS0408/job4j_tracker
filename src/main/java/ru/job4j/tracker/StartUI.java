package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI extends Item {
    public static void main(String[] args) {
        StartUI item = new StartUI();
        LocalDateTime currentDateTime = item.getLoad();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formater);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}