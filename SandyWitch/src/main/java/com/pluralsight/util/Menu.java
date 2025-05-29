package com.pluralsight.util;

import com.pluralsight.models.Drink;
import com.pluralsight.models.Side;
import com.pluralsight.ui.SandwichBuilder;

import java.util.List;
import java.util.Scanner;

//TODO MAKE MORE PERSONAL LATER, JUST SOME OPTIONS NOW
public class Menu {
    //scanner for whole menu
    static Scanner input = new Scanner(System.in);

    private static final List<String> meatOptions = List.of(
      "Shrimp", "Soft Shell Crab", "Crab Cake", "Kielbasa", "Beef", "Chicken", "Tofu", "Portabella"
    );
    private static final List<String> cheeseOptions = List.of(
      "American", "Cheddar", "Mozzerella", "Bleu", "Pepperjack", "Provolone"
    );
    private static final List<String> regularOptions = List.of(
      "Lettuce", "Onion", "Tomato", "Jalapeno", "Cucumber", "Pickles", "* - Magic Sand - *" , "Regular Sand"
    );
    private static final List<String> sauceOptions = List.of(
      "Mayo", "Tartar", "Remoulade", "Ketchup", "Mustard"
    );
    private static final List<String> sideTypes = List.of(
            "Spam Musubi", "Calamari", "House Chips"
    );
    private static final List<String> drinkFlavors = List.of(
            "Coke", "Orange Fanta", "Ginger Beer", "Love Potion", "Drop of Luck"
    );

    //SANDWICH OPTION DISPLAY METHODS

    public static List<String> getMeatOptions(){
        return meatOptions;
    }

    public static List<String> getCheeseOptions() {
        return cheeseOptions;
    }

    public static List<String> getRegularOptions() {
        return regularOptions;
    }

    public static List<String> getSauceOptions() {
        return sauceOptions;
    }

    public static Side selectSide(){
        System.out.println("Side Options: ");
        System.out.println(sideTypes);
        System.out.print("Please enter your Selection Here: ");
        String type = input.nextLine().toLowerCase().trim();
        return new Side(type);
    }

    public static void addSandwich() {
        SandwichBuilder.build();
    }

    public static Drink selectDrink() {
        System.out.println("Drink Options: ");
        System.out.println(drinkFlavors);
        System.out.print("Please enter your Selection Here: ");
        String name = input.nextLine().toLowerCase().trim();
        System.out.print("Size Options: Small, Medium, Large: ");
        String size = input.nextLine().toLowerCase().trim();
        return new Drink(name, size);
    }

}