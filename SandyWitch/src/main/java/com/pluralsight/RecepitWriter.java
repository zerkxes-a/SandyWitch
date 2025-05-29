package com.pluralsight;

import models.Drink;
import models.Sandwich;
import models.Side;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecepitWriter {

   public static void saveOrder(Order order) {
       String timestamp = LocalDateTime.now().format(
               DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
       String filename = "src/main/resources/" + timestamp + ".txt";

       try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
          writer.write("---* RECEIPT *---\n");
          writer.write("Transaction Time: " + timestamp + "\n");


           for (Sandwich sandwiches : order.getSandwiches()){
               writer.write(sandwiches.toString() + " ");
           }
           for (Drink drinks : order.getDrinks()){
               writer.write(drinks.toString() + " ");
           }
           for (Side sides : order.getSides()) {
               writer.write(sides.toString() + " ");
           }

           writer.write("Total: $" + String.format("%.2f", order.getTotal()));
       } catch (Exception e) {
           System.out.println("Error saving receipt: " + e.getMessage());
       }
   }
}
