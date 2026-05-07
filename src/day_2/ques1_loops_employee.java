package day_2;
import java.util.Scanner;
public class ques1_loops_employee {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		double [] salary =new double[n];
		
		for (int i=0; i<n;i++) {
			System.out.println("enter salary");
			salary[i] =sc.nextDouble();
		}
		   System.out.println("updated salary");
			for(int i=0;i<n; i++) {
				salary[i] += salary[i]*0.10;
				System.out.println(salary[i]);
		}
			sc.close();
	}

}
