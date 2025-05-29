package com.pluralsight;

import com.pluralsight.models.Item;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Order{
    private Order() {}

    private static ArrayList<Item>items = new ArrayList<>();

    public static void addItem(Item item){
        items.add(item);
    }

    public static void printSummary(){
        System.out.println("---* Order Summary *---");
        System.out.println(orderString());
    }

    public static double getTotal(){
        return items.stream().mapToDouble(Item::getPrice).sum();
    }


    public static String orderString() {
        return items.stream().map(item -> item.toString() + "\n").collect(Collectors.joining()) + "\n *--- Total Price ---* \n$" + getTotal();
    }

    public static void clearOrder(){
        items.clear();
    }
}



