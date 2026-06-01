package class_assi_day3;

public class bank_Account {
	 private double balance;

	    public void deposit(double amount) {
	        if (amount > 0) balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Invalid withdrawal");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }


public static void main(String[] args) {
    bank_Account acc = new bank_Account();
    acc.deposit(1000);
    acc.withdraw(300);
    acc.withdraw(800);
    System.out.println(acc.getBalance());
}
}
