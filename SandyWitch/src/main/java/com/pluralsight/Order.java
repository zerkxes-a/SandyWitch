package com.pluralsight;

import models.*;
import java.util.ArrayList;
import java.util.List;

public class Order{
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Side> sides = new ArrayList<>();

    //adds items to array list
    public void addSandwich(Sandwich sandwich) {sandwiches.add(sandwich);}
    public void addDrink(Drink drink) {drinks.add(drink);}
    public void addSide(Side side) {sides.add(side);}

    //looks lists and prints out items added
    public void printSummary(){
        System.out.println("---* Order Summary *---");
        for (Sandwich sandwich : sandwiches) System.out.println(sandwiches);
        for (Drink drink : drinks) System.out.println(drinks);
        for (Side side : sides) System.out.println(sides);
        System.out.println("Total: $" + String.format("%.2f", getTotal()));
    }

    public List<Sandwich> getSandwiches(){
        return sandwiches;
    }
    public List<Drink> getDrinks(){
        return drinks;
    }
    public List<Side> getSides(){
        return sides;
    }
    //TODO IMPLEMENT GET PRICE FOR SANDWICH
    public double getTotal(){
        return  sandwiches.stream().mapToDouble(Sandwich::getPrice).sum() +
                drinks.stream().mapToDouble(Drink::getPrice).sum() +
                sides.stream().mapToDouble(Side::getPrice).sum();
    }

}
