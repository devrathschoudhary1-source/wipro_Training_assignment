package class_assi_day10;


import java.util.Scanner;
import java.util.TreeSet;

public class hospital_management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> patientIds = new TreeSet<>();

        int choice;

        do {
            System.out.println("\n Hospital management System ");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();

                    if (!patientIds.add(id)) {
                        System.out.println(" ID already registered");
                    } else {
                        System.out.println(" Patient added to the system");
                    }
                    break;

                case 2:
                    if (patientIds.isEmpty()) {
                        System.out.println("No patients registered .");
                    } else {
                        System.out.println("Registered Patients: " + patientIds);
                    }
                    break;

                case 3:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
