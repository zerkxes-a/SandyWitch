package com.pluralsight;

import java.util.Scanner;



public class SandyWitch {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("*-Welcome to The Sandy Witch Cafe-*");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Please choose an option: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    handleNewOrder(); //TODO IMPLEMENT HANDLE NEW ORDER
                    break;
                case "0":
                    System.out.println("Thank you for visiting! Have a magical day!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }
    private static void handleNewOrder() {
        Order order = new Order();
        while (true) {
            System.out.println("---* Order Menu *---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Side");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Please select your choice here: ");
            String option = input.nextLine();

            //TODO IMPLEMENT ALL MAKE WHAT AN ORDER IS AND ITEMS BITCH
            switch (option){
                case "1":
                    //TODO ADD SANDWICH METHOD(BOTH CUSTOM AND SIGNATURE OPTIONS)
                    break;
                case "2":
                    Menu.selectDrink();
                    break;
                case "3":
                    Menu.selectSide(); //TODO STILL IMPLEMET
                    break;
                case "4":
                    break;
                case "0":
                    System.out.println("Order Cancelled");
                    break;
            }
        }
    }
}
