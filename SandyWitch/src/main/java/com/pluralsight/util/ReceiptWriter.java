package com.pluralsight.util;

import com.pluralsight.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {


   public static void saveOrder() {
       String timestamp = LocalDateTime.now().format(
               DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
       String filename = "src/main/resources/" + timestamp + ".txt";

       try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
          writer.write("---* RECEIPT *---\n");
          writer.write("Transaction Time: " + timestamp + "\n");
          writer.write(Order.orderString());
          Order.clearOrder();
       } catch (Exception e) {
           System.out.println("Error saving receipt: " + e.getMessage());
       }
   }
}
