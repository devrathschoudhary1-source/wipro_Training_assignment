package class_assin_day12;

import java.io.*;
import java.util.*;

class FoodDelivery {

   
    public static void addMenu(String id, String item, double price) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("menu.txt", true))) {
            bw.write(id + "," + item + "," + price);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
    public static void addOrder(String orderId, String customerId, String item, int qty, double total) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("orders.txt", true))) {
            bw.write(orderId + "," + customerId + "," + item + "," + qty + "," + total);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void addDelivery(String deliveryId, String orderId, String boy, String status) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("delivery.txt", true))) {
            bw.write(deliveryId + "," + orderId + "," + boy + "," + status);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void readFile(String fileName, String title) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            System.out.println("\n" + title);
            

            while ((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));
            }

        } catch (IOException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}


public class FoodApp {

    public static void main(String[] args) {

        
        FoodDelivery.addMenu("M101", "Burger", 120);
        FoodDelivery.addMenu("M102", "Pizza", 250);
        FoodDelivery.addMenu("M103", "Pasta", 180);

       
        FoodDelivery.addOrder("O201", "C001", "Pizza", 2, 500);
        FoodDelivery.addOrder("O202", "C002", "Burger", 1, 120);

        
        FoodDelivery.addDelivery("D301", "O201", "Ravi", "Delivered");
        FoodDelivery.addDelivery("D302", "O202", "Amit", "On The Way");

       
        FoodDelivery.readFile("menu.txt", " Menu");
        FoodDelivery.readFile("orders.txt", " Orders");
        FoodDelivery.readFile("delivery.txt", " Delivery Logs");
    }
}
