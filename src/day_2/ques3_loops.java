package day_2;
import java.util.Scanner;
public class ques3_loops {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int[] choices = new int[5]; 

	for (int i = 0; i < 5; i++) {
	choices[i] = sc.nextInt();

	switch (choices[i]) {
	case 1:
	System.out.println("Balance: 10000");
	break;
	case 2:
	System.out.println("Withdraw");
	break;
	case 3:
	System.out.println("Exit");
	break;
	default:
	System.out.println("Invalid");
	}

	if (choices[i] == 3) break;
	}

	sc.close();
	}
	}



