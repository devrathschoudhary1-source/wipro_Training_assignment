package class_assin_day12;

import java.io.*;
import java.util.*;

class ECommerce {


    public static void addOrder(String orderId, String customerId, String product, int qty, double total) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("orders.txt", true))) {
            bw.write(orderId + "," + customerId + "," + product + "," + qty + "," + total);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static void addInvoice(String invoiceId, String orderId, double amount, String tax, double finalAmount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("invoices.txt", true))) {
            bw.write(invoiceId + "," + orderId + "," + amount + "," + tax + "," + finalAmount);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static void addShipping(String shipId, String orderId, String name, String address, String status) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("shipping.txt", true))) {
            bw.write(shipId + "," + orderId + "," + name + "," + address + "," + status);
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


public class ECommerceApp {

    public static void main(String[] args) {

        
        ECommerce.addOrder("O101", "C001", "Mobile", 2, 120000);
        ECommerce.addOrder("O102", "C002", "Pendrive", 1, 500);

        
        ECommerce.addInvoice("INV1", "O101", 120000, "GST18%", 141600);
        ECommerce.addInvoice("INV2", "O102", 500, "GST18%", 590);

        
        ECommerce.addShipping("S1", "O101", "Ravi", "Kolkata", "Delivered");
        ECommerce.addShipping("S2", "O102", "Amit", "Delhi", "In Transit");

    
        ECommerce.readFile("orders.txt", " Orders");
        ECommerce.readFile("invoices.txt", " Invoices");
        ECommerce.readFile("shipping.txt", " Shipping Details");
    }
}