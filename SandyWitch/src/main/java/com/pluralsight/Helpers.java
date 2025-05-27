package com.pluralsight;

import java.util.Scanner;

public class Helpers {
    Scanner input = new Scanner(System.in);


    public static String getString(Scanner input, String prompt){
        System.out.print(prompt);
        return input.nextLine().trim();
    }


}
