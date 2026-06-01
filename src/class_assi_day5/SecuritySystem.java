package class_assi_day5;

import java.util.Scanner;

final class SecuritySystem {

    String encrypt(String data) {
        String result = "";

        for (int i = 0; i < data.length(); i++) {
            result += (char)(data.charAt(i) + 1); 
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data: ");
        String data = sc.nextLine();

        SecuritySystem sec = new SecuritySystem();
        String encrypted = sec.encrypt(data);

        System.out.println("Encrypted Data: " + encrypted);

        sc.close();
    }
}