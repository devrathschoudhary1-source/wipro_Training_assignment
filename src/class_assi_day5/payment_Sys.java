package class_assi_day5;

import java.util.Scanner;

class payment_Sys {

    final void processPayment(double amount) {
        System.out.println("Securely processing payment of ₹" + amount);
    }

    void chooseMethod() {
        System.out.println("Payment via UPI");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        payment_Sys user = new payment_Sys();

        user.chooseMethod();
        user.processPayment(amount);

        sc.close();
    }
}