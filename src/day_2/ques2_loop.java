package day_2;
import java.util.Scanner;
public class ques2_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String correct ="1234";
		String [] attempts = new String[3];
		
		for(int i=0; i<3; i++) {
			attempts[i]=sc.nextLine();
			if(attempts[i].equals(correct)) {
				System.out.println("Access Granted");
				return;
			}
			else {
				System.out.println("wrong password");
			}
		}
		System.out.println("acount locked");
		sc.close();
		
	}
	
	

}
