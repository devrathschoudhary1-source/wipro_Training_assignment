package class_assi_day5;



class PaymentSystem {

    final void processPayment(double amount) {
        System.out.println("Securely processing payment of ₹" + amount);
    }
}

class UserPayment extends PaymentSystem {

    void chooseMethod() {
        System.out.println("Payment via UPI");
    }

    public static void main(String[] args) {

    	

    	       UserPayment obj = new UserPayment();

    	        obj.chooseMethod();
    	        obj.processPayment(500);
    	    }
    	}
