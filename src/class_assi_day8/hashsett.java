package class_assi_day8;

import java.util.*;
import java.util.Scanner;

public class hashsett {

    
    HashSet<Integer> patients = new HashSet<>();

    
    public void registerPatient(int id) {

        
        if (patients.contains(id)) {
            System.out.println("Id same is already registered");
            System.out.println("Already registered");
        } else {
            patients.add(id);
            System.out.println("Patient added to the system");
        }
    }

   
    public void viewPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients registered yet.");
            return;
        }

        System.out.println("Unique Registered Patients:");
        for (Integer id : patients) {
            System.out.println("Patient ID: " + id);
        }
    }

   
    public static void main(String[] args) {

        hashsett system = new hashsett();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    system.registerPatient(id);
                    break;

                case 2:
                    system.viewPatients();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}