package com.pluralsight.ui;

import com.pluralsight.util.Helpers;
import com.pluralsight.util.Menu;
import com.pluralsight.Order;
import com.pluralsight.util.RecepitWriter;

import java.util.Scanner;


public class UserInterface {
    static Scanner input = Helpers.getScanner();
    public class SandyWitch {


        public static void main(String[] args) {
            while (true) {
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

        public static void handleNewOrder() {
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

                //TODO IMPLEMENT ALL MAKE WHAT AN ORDER IS AND ITEMS
                switch (option) {
                    case "1":
                        Menu.addSandwich();
                        break;
                    case "2":
                        Menu.selectDrink();
                        break;
                    case "3":
                        Menu.selectSide(); //TODO STILL IMPLEMET
                        break;
                    case "4":
                        RecepitWriter.saveOrder(order);
                        break;
                    case "0":
                        System.out.println("Order Cancelled");
                        break;
                }
            }
        }
    }
}