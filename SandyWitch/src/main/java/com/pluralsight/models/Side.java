package com.pluralsight.models;

public class Side extends Item{


    public Side(String name) {
        super(name);

    }

    public double getPrice() {
        double price = 0.0;
        if (name.equals("spam musubi")) {
            price = 3.50;
        } else if (name.equals("calamari")) {
            price = 7.00;
        } else if (name.equals("house chips")) {
            price = 2.50;
        }
        return price;
    }



    @Override
    public String toString() {
        return ("Side selection: " + name + " : " + String.format("$%.2f", getPrice()));
    }
}
