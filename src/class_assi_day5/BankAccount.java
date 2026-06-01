package class_assi_day5;

import java.util.Scanner;

class BankAccount {

    final int accountNumber;
    String name;

    BankAccount(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount user = new BankAccount(accNo, name);
        user.display();
    }
}