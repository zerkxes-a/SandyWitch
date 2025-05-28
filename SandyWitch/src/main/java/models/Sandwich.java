package models;

import java.util.ArrayList;
import java.util.List;

public class Sandwich{
    protected BreadType bread;
    protected SandwichSize size;
    protected boolean toasted;
    protected List<Topping> toppings;


    public Sandwich(BreadType bread, SandwichSize size, boolean toasted) {
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping ingredient){
        toppings.add(ingredient);
    }
    //TODO CHECK TO SEE IF WORKS WHEN IMPLEMENT
    public double getPrice() {
        double meatprice = 0.0;
        double cheeseprice = 0.0;
        double price = meatprice + cheeseprice + size.getPrice();
        if (size.equals("small")) {
            meatprice = 1.00;
            cheeseprice = 0.75;
            if (Topping.isExtra()){
                meatprice += 0.50;
                cheeseprice += 0.30;}
        } else if (size.equals("medium")) {
            meatprice = 2.00;
            cheeseprice = 1.50;
            if (Topping.isExtra()) {
                meatprice += 1.00;
                cheeseprice += 0.60;}
        } else if (size.equals("large")) {
            meatprice = 3.00;
            cheeseprice = 2.25;
            if ((Topping.isExtra())){
                meatprice += 1.50;
                cheeseprice += 0.90;}
        }
        return price;
    }
}