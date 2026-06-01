package class_assin_day12;


import java.io.*;
import java.util.*;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}

public class Bank_Acc {

    static String fileName = "transaction_history.txt";

    
    public static void addAccount(int accNo, String name, double balance) {
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(fileName, true))) {

            bw.write(accNo + "," + name + "," + balance);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static List<Account> readAccounts() {
        List<Account> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int accNo = Integer.parseInt(data[0]);
                String name = data[1];
                double balance = Double.parseDouble(data[2]);

                list.add(new Account(accNo, name, balance));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    
    public static void main(String[] args) {

        
        addAccount(1001, "Ram", 5000.0);
        addAccount(1002, "Shyam", 7500.5);
        addAccount(1003, "Kishan", 6200.0);

        
        List<Account> accounts = readAccounts();

        System.out.println("Account Details:");
        
        for (Account acc : accounts) {
            System.out.println(acc.accNo + " " + acc.name + " " + acc.balance);
        }
    }
}
