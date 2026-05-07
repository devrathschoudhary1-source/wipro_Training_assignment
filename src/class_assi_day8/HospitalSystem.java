package class_assi_day8;

import java.util.HashSet;
import java.util.Scanner;

class PatientId {
    int id;
    String name;

    PatientId(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
   
    public boolean equals(Object obj) {
        PatientId p = (PatientId) obj;
        return this.id == p.id;
    }

  
    public int hashCode() {
        return id;
    }
}

public class HospitalSystem {

    HashSet<PatientId> patients = new HashSet<>();

    public void registerPatient(int id, String name) {

        PatientId newPatient = new PatientId(id, name);

        if (patients.contains(newPatient)) {
            System.out.println("Id same is already registered");
            System.out.println("Already registered");
        } else {
            patients.add(newPatient);
            System.out.println("Patient added to the system");
        }
    }

    public void viewPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients registered yet.");
            return;
        }

        System.out.println("List of Unique Registered Patients:");

        for (PatientId p : patients) {
            System.out.println("ID: " + p.id + " | Name: " + p.name);
        }
    }

    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    system.registerPatient(id, name);
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