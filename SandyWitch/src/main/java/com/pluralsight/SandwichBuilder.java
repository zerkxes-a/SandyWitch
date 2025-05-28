package com.pluralsight;

import models.*;

import java.util.Scanner;

public class SandwichBuilder {
    static Scanner input = new Scanner(System.in);
    public static Sandwich build(){
        System.out.println("*-Sandwich Options-*");
        System.out.println("1) Signature Sandwich");
        System.out.println("2) Custom Sandwich");
        String choice = input.nextLine();
        System.out.print("Please enter your selection here: ");

        if (choice.equals("1"))
            return chooseSignature();
        return buildCustom();


    }

    private static Sandwich buildCustom() {
        BreadType bread = BreadType.valueOf(Helpers.getString(input, "Choose your Bread (Po Boy, Texas Toast, Sourdough, Brioche Bun").toLowerCase());
        SandwichSize sandwichSize = SandwichSize.valueof(Helpers.getString(input, "Choose Size: Small (4 inch - $5.50) | Medium (8 inch - $7.00) | Large (12 inch - $9.00)".toLowerCase()));
        boolean toasted = Helpers.getYesNo(input, "Would you like this Toasted? (yes/no)");

        Sandwich customChoice = new Sandwich(bread, sandwichSize,toasted);

        for (String meat : Menu.getMeatOptions())
            if (Helpers.getYesNo(input, "Add " + meat + " ?")){
                boolean extra = Helpers.getYesNo(input, "Extra " + meat + " ?");
                customChoice.addTopping(new Topping(meat, new ToppingType(meat), extra));
            }
        for (String cheese: Menu.getCheeseOptions())
            if (Helpers.getYesNo(input, "Add " + cheese + " ?")){
                boolean extra = Helpers.getYesNo(input, "Extra " + cheese + " ?");
                customChoice.addTopping(new Topping(cheese, new ToppingType(cheese), extra));
            }

        for (String topping: Menu.getRegularOptions())
            if (Helpers.getYesNo(input, "Add " + topping + " ?")){
                boolean extra = Helpers.getYesNo(input, "Extra " + topping + " ?");
                customChoice.addTopping(new Topping(topping, new ToppingType(topping), false));
            }
        for (String sauce: Menu.getSauceOptions())
            if (Helpers.getYesNo(input, "Add " + sauce + " ?")){
                boolean extra = Helpers.getYesNo(input, "Extra " + sauce + " ?");
                customChoice.addTopping(new Topping(sauce, new ToppingType(sauce), false));
            }
        return customChoice;
    }

    private static Sandwich chooseSignature() {
        return null;
    }
}
