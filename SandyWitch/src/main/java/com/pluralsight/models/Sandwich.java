package com.pluralsight.models;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sandwich extends Item{
    protected String bread;
    protected String size;
    protected boolean toasted;
    protected ArrayList<Topping>toppings;

    public Sandwich(String name, ArrayList<Topping> toppings, boolean toasted, String size, String bread) {
        super(name);
        this.toppings = toppings;
        this.toasted = toasted;
        this.size = size;
        this.bread = bread;
    }


    @Override
    public double getPrice() {
        double toppingsTotal = toppings.stream().mapToDouble(topping -> topping.getPrice(this.size) ).sum();
        switch (size){
            case "small"->{
                return 5.50 + toppingsTotal;
            }
            case "medium"->{
                return 7.00 + toppingsTotal;
            }
            case "large"->{
                return 8.50 + toppingsTotal;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
                //get the array list of toppings and go through each item
        return getDescription() + "\n " + toppings.stream()
                //mapping each topping to string
                .map(topping -> topping.toString(size) + "\n")
                //join all toppings into one string
                .collect(Collectors.joining());}

    public String getDescription(){
        return "Sandwich for " + name + " \n " + size + " " + bread + (toasted ? " toasted" : "") + ": $" + getPrice();
    }
}