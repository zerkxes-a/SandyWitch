package com.pluralsight.ui;

import com.pluralsight.models.Sandwich;
import com.pluralsight.models.Topping;
import com.pluralsight.util.Helpers;
import com.pluralsight.util.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichBuilder {
    public static Scanner input = Helpers.getScanner();

    public static Sandwich build(){

        System.out.println("*-Sandwich Options-*");
        System.out.println("1) Signature Sandwich");
        System.out.println("2) Custom Sandwich");
        String choice = SandwichBuilder.input.nextLine();
        System.out.print("Please enter your selection here: ");

        if (choice.equals("1"))
            return null;
        return buildCustom();
    }

    public static Sandwich buildCustom() {
        String name = Helpers.getString(input, "Please enter your Name: ").toLowerCase().trim();
        String bread = Helpers.getString(input, "Choose your Bread (Po Boy, Texas Toast, Sourdough, Brioche Bun: ").toLowerCase().trim();
        String size = Helpers.getString(input, "Choose Size: Small (4 inch - $5.50) | Medium (8 inch - $7.00) | Large (12 inch - $9.00): ").toLowerCase().trim();
        boolean toasted = Helpers.getYesNo(input, "Would you like this Toasted? (yes/no): ");
        ArrayList<Topping> toppings = new ArrayList<>();

        //Loop to add main meat to sandwich
        List<String> meatOptions = Menu.getMeatOptions();
        System.out.println("*--- Meat Options ---*");
        //for meat options print out each item position until the end is reached
        for (int i = 0; i < meatOptions.size(); i++){System.out.println(i + ") " + meatOptions.get(i));}
        System.out.println("X) Go to next choice: ");

        String meatSelection = null;
        while(true){
            System.out.print("Enter Selection Here: ");
            String userSelection = input.nextLine();
            //see if user input is the same as printed out meat option numbers. if not see if input is X to skip input
            try{
                meatSelection = meatOptions.get(Integer.parseInt(userSelection));
                 break;
            }catch(Exception e){
               if (userSelection.equalsIgnoreCase("X"))break;
            }
        }
        //if user selection is not empty, add a topping to the array list with the topping type and name value
        if(meatSelection != null) toppings.add(new Topping("meat", meatSelection));

        //Loop to add extra meat to sandwich
        System.out.println("*--- Extra Meat Options ---*");
        for (int i = 0; i < meatOptions.size(); i++){System.out.println(i + ") " + meatOptions.get(i));}
        System.out.println("X) Go to next choice: ");
        String extraMeatSelection = null;
        while(true){
            System.out.print("Enter Selection Here: ");
            String userSelection = input.nextLine();
            try{
                extraMeatSelection = meatOptions.get(Integer.parseInt(userSelection));
                break;
            }catch(Exception e){
                if (userSelection.equalsIgnoreCase("X"))break;
            }
        }
        if (extraMeatSelection != null) toppings.add(new Topping("extra meat", extraMeatSelection));


        //Loop to add cheese to sandwich
        List<String> cheeseOptions = Menu.getCheeseOptions();
        System.out.println("*--- Cheese Options ---*");
        for (int i = 0; i < cheeseOptions.size(); i++){System.out.println(i + ") " + cheeseOptions.get(i));}
        System.out.println("X) Go to next choice: ");
        String cheeseSelection = null;
        while(true){
            System.out.print("Enter Selection Here: ");
            String userSelection = input.nextLine();
            try{
                cheeseSelection = cheeseOptions.get(Integer.parseInt(userSelection));
                break;
            }catch(Exception e){
                if (userSelection.equalsIgnoreCase("X"))break;
            }
        }if(cheeseSelection != null) toppings.add(new Topping("cheese", cheeseSelection));


        //loop to add extra cheese
        System.out.println("*--- Extra Cheese Options ---*");
        for (int i = 0; i < cheeseOptions.size(); i++){System.out.println(i + ") " + cheeseOptions.get(i));}
        System.out.println("X) Go to next choice: ");
        String extraCheeseSelection = null;
        while(true){
            System.out.print("Enter Selection Here: ");
            String userSelection = input.nextLine();
            try{
                extraCheeseSelection = cheeseOptions.get(Integer.parseInt(userSelection));
                break;
            }catch(Exception e){
                if (userSelection.equalsIgnoreCase("X"))break;
            }
        }if(extraCheeseSelection != null) toppings.add(new Topping("extra cheese", extraCheeseSelection));



        List<String> regularOptions = Menu.getRegularOptions();
        System.out.println("*--- Regular Options ---*");
        for (int i = 0; i < regularOptions.size(); i++){System.out.println(i + ") " + regularOptions.get(i));}
        System.out.println("X) Go to next choice: ");
        String regularSelection = null;
        while(true){
            System.out.print("Enter Selection Here: ");
            String userSelection = input.nextLine();
            try{
                regularSelection = regularOptions.get(Integer.parseInt(userSelection));
                break;
            }catch(Exception e){
                if (userSelection.equalsIgnoreCase("X"))break;
            }
        }if(regularSelection != null) toppings.add(new Topping("regular", regularSelection));


        List<String> sauceOptions = Menu.getSauceOptions();
        System.out.println("*--- Sauce Options ---*");
        for (int i = 0; i < sauceOptions.size(); i++){System.out.println(i + ") " + sauceOptions.get(i));}
        System.out.println("X) Go to next choice: ");
        String sauceSelection = null;
        while(true){
            System.out.print("Enter Selection Here: ");
            String userSelection = input.nextLine();
            try{
                sauceSelection = sauceOptions.get(Integer.parseInt(userSelection));
                break;
            }catch(Exception e){
                if (userSelection.equalsIgnoreCase("X"))break;
            }
        }if(sauceSelection != null) toppings.add(new Topping("sauce", sauceSelection));

        return new Sandwich(name, toppings, toasted,size, bread);
    }

    //tODO BUILD CHOOSE SIGNATURE
    private static Sandwich chooseSignature() {
        return null;
    }
}
