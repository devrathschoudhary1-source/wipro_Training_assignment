package class_assi_day5;

interface PaymentMethod {
    void pay(double amount);

    default void printamount(double amount) {
        System.out.println("Payment of ₹" + amount + " done successfully.");
    }
}

class PhonePePayment implements PaymentMethod {

   
    public void pay(double amount) {
        System.out.println("Processing PhonePe payment");
        printamount(amount);
    }
}

class GooglePayPayment implements PaymentMethod {

    
    public void pay(double amount) {
        System.out.println("Processing Google Pay payment");
        printamount(amount);
    }
}

class PaytmPayment implements PaymentMethod {

    
    public void pay(double amount) {
        System.out.println("Processing Paytm payment");
        printamount(amount);
    }
}

class PaymentProcessor {

    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}

public class paymentsys {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod phonepe = new PhonePePayment();
        PaymentMethod gpay = new GooglePayPayment();
        PaymentMethod paytm = new PaytmPayment();

        processor.processPayment(phonepe, 100);
        processor.processPayment(gpay, 100);
        processor.processPayment(paytm, 100);
    }
}
