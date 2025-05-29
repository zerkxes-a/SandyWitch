package models;

import java.util.ArrayList;

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
    public String add() {
        return "";
    }

    /*public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(size).append(" ").append(bread).append(" sandwich\n");
        if (toasted) stringBuilder.append("Toasted\n");
        for (Topping topping: toppings.toppings)
            stringBuilder.append(" - ").append(topping.getName()).append(Topping.isExtra() ? " (extra)" : " \n");
        stringBuilder.append("Subtotal: $").append(String.format("%.2f", getPrice())).append("\n");
        return stringBuilder.toString();
    }*/

    public String getDescription(){
        return "Sandwich: " + size + " on " + bread;

    }
}