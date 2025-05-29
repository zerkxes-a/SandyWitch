package models;

import com.pluralsight.Helpers;
import com.pluralsight.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class SandwichBuilder {
    static Scanner input = new Scanner(System.in);
    public static void build(){
        System.out.println("*-Sandwich Options-*");
        System.out.println("1) Signature Sandwich");
        System.out.println("2) Custom Sandwich");
        String choice = SandwichBuilder.input.nextLine();
        System.out.print("Please enter your selection here: ");

        if (choice.equals("1"))
            return;
        buildCustom();


    }

    private static Sandwich buildCustom() {
        String name = "";
        ArrayList<Topping> toppings = new ArrayList<>();
        String bread = Helpers.getString(input, "Choose your Bread (Po Boy, Texas Toast, Sourdough, Brioche Bun").toLowerCase();
        String size = Helpers.getString(input, "Choose Size: Small (4 inch - $5.50) | Medium (8 inch - $7.00) | Large (12 inch - $9.00)".toLowerCase());
        boolean toasted = Helpers.getYesNo(input, "Would you like this Toasted? (yes/no)");
        //TODO FILL TOPPINGS ARRAY LIST WITH USER SELECTION DONE OR SKIP TOO
        Menu.getMeatOptions().forEach(System.out::println);
        //TODO MAKE LOOP FOR MUTIPLE EXTRA MEATS DONE OR SKIP TOO
        Menu.getMeatOptions().forEach(System.out::println);
        Menu.getCheeseOptions().forEach(System.out::println);
        //TODO FILL LOOP FOR MUTIOPLE EXTRA CHEEZ DONE OR SKIP TOO
        Menu.getCheeseOptions().forEach(System.out::println);

        //tODO ADD LOOP FOR REGULAR DONE OR SKIP OPTION TOO
        Menu.getRegularOptions().forEach(System.out::println);
        return new Sandwich(name, toppings, toasted,size, bread);
    }

    //tODO BUILD CHOOSE SIGNATURE
    private static Sandwich chooseSignature() {
        return null;
    }


}
