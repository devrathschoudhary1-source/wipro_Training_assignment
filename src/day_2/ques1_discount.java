package day_2;

public class ques1_discount {
	public static void main(String[] args) {
		int amount = 2000;
		double discount = 0 ;
		 if (amount<=5000) {
			 discount = 0.20;
			 
		 }
		 else if (amount<=1000){
			 discount = 0.50;
		 }
		 
		 double finalamount =amount -(amount*discount);
			System.out.println("your discounted price is"+finalamount); 
		 }
	}


