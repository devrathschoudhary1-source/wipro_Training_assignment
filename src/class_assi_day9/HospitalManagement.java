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
        return "ID: " + id + " | Name: " + name;
    }
}
public class HospitalManagement {

    static LinkedList<Patient> queue = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static int idCounter = 1;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Hospital Patient System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Remove Patient (Treated)");
            System.out.println("4. View All Patients");
            System.out.println("5. Search Patient");
            System.out.println("6. Show First Patient");
            System.out.println("7. Show Last Patient");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addPatient(); break;
                case 2: addEmergencyPatient(); break;
                case 3: removePatient(); break;
                case 4: viewPatients(); break;
                case 5: searchPatient(); break;
                case 6: showFirst(); break;
                case 7: showLast(); break;
                case 8: System.out.println("Thank you!"); return;
                default: System.out.println("Invalid choice");
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        queue.add(new Patient(idCounter++, name));
        System.out.println("Patient added successfully");
    }

    static void addEmergencyPatient() {
        System.out.print("Enter emergency patient name: ");
        String name = sc.nextLine();

        queue.addFirst(new Patient(idCounter++, name));
        System.out.println("Emergency patient added at first position");
    }

    static void removePatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients in queue");
        } else {
            System.out.println("Patient treated: " + queue.removeFirst());
        }
    }

    static void viewPatients() {
        if (queue.isEmpty()) {
            System.out.println("No patients available");
            return;
        }

        System.out.println("\n--- Patient List ---");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }

    static void searchPatient() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        for (Patient p : queue) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Patient found: " + p);
                return;
            }
        }
        System.out.println("Patient not found");
    }

    static void showFirst() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("First patient: " + queue.getFirst());
        }
    }

    static void showLast() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Last patient: " + queue.getLast());
        }
    }
}
