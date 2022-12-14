package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private LocalDateTime created = LocalDateTime.now();
    private int id;
    private String name;

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getLoad() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}