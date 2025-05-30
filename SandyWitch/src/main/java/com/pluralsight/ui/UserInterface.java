package com.pluralsight.ui;

import com.pluralsight.Order;
import com.pluralsight.util.Helpers;
import com.pluralsight.util.Menu;
import com.pluralsight.util.ReceiptWriter;

import java.util.Scanner;


public class UserInterface {
    static Scanner input = Helpers.getScanner();
    public class SandyWitch {


        public static void sandyWitch(){
            while (true) {
                System.out.println("*-Welcome to The Sandy Witch Cafe-*");
                System.out.println("1) New Order");
                System.out.println("0) Exit");
                System.out.print("Please choose an option: ");
                String choice = input.nextLine();
                switch (choice) {
                    case "1":
                        handleNewOrder();
                        break;
                    case "0":
                        System.out.println("Thank you for visiting! Have a magical day!");
                        System.exit(0);
                        return;
                    default:
                        System.out.println("Invalid choice, please try again");
                }
            }
        }

        public static void handleNewOrder() {
            while (true) {
                Order.printSummary();
                System.out.println("---* Order Menu *---");
                System.out.println("1) Add Sandwich");
                System.out.println("2) Add Drink");
                System.out.println("3) Add Side");
                System.out.println("4) Checkout");
                System.out.println("0) Cancel Order");
                System.out.print("Please select your choice here: ");
                String option = input.nextLine();


                switch (option) {
                    case "1":
                        Menu.addSandwich();
                        break;
                    case "2":
                        Order.addItem(Menu.selectDrink());
                        break;
                    case "3":
                        Order.addItem(Menu.selectSide());
                        break;
                    case "4":
                        ReceiptWriter.saveOrder();
                        break;
                    case "0":
                        Order.clearOrder();
                        System.out.println("---* Order Cancelled *---");
                        sandyWitch();
                        break;
                }
            }
        }
    }
}