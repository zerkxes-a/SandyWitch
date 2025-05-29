package com.pluralsight.models;

public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public abstract String add();

}
