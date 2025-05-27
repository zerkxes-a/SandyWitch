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
}