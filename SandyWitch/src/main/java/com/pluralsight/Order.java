package com.pluralsight;

import models.Item;

import java.util.ArrayList;

public class Order{
    private static ArrayList<Item>items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
    public void printSummary(){
        System.out.println("---* Order Summary *---");

    }



    //TODO IMPLEMENT GET PRICE FOR SANDWICH
    public double getTotal(){
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

}



