package com.pluralsight;

import java.util.Scanner;

public class Helpers {
    Scanner input = new Scanner(System.in);

    public static String getString(Scanner input, String prompt){
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public static boolean getYesNo(Scanner input, String prompt){
        while(true){
            System.out.print(prompt + " (yes/no): ");
            String yesNo = input.nextLine().trim().toLowerCase();
            if (yesNo.equals("yes"))
                return true;
            if (yesNo.equals("no"))
                return false;
            else System.out.println("Please only enter 'yes' or 'no'");

        }
    }
    public static int getInt(Scanner input, String prompt, int min, int max){
        while (true){
            try {
                System.out.println(prompt);
                int value = Integer.parseInt(String.valueOf(input.nextInt(input.nextInt())));
                if (value >= min && value <= max)
                    return value;
            }
            catch (NumberFormatException e) {
                throw new RuntimeException(e);

            }
            System.out.println("Invalid number. Try again");
        }
    }

}
