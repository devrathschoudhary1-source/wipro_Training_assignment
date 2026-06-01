package class_assi_day9;

import java.util.*;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class hos {
    static Map<Integer, Patient> patientMap = new HashMap<>();

    public static void registerPatient(int id, String name) {
        if (patientMap.containsKey(id)) {
            System.out.println("Already registered with ID: " + id);
        } else {
            Patient p = new Patient(id, name);
            patientMap.put(id, p);
            System.out.println("Patient added: " + p);
        }
    }

    public static void viewPatients() {
        if (patientMap.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            for (Patient p : patientMap.values()) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                registerPatient(id, name);
            } else if (choice == 2) {
                viewPatients();
            } else {
                break;
            }
        }
        sc.close();
    }
}