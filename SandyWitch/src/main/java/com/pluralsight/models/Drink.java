package com.pluralsight.models;

public class Drink extends Item {
    private String size;

    public Drink(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        if (size.equals("small")) {
            price = 2.00;
        } else if (size.equals("medium")) {
            price = 2.50;
        } else if (size.equals("large")) {
            price = 3.00;
        }

        return price;
    }

    @Override
    public String add() {
        return name;
    }


    @Override
    public String toString() {
        return ("Drink selection: " + size + " " + name + " : " + String.format("$.2d", getPrice()));
    }
}
