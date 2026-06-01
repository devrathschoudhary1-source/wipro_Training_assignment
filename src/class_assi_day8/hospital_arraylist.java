package class_assi_day8;


import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String disease;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }
}

public class hospital_arraylist {
    public static void main(String[] args) {

        ArrayList<Patient> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Patient Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    Patient p = new Patient();

                    System.out.print("Enter Name: ");
                    p.setName(sc.nextLine());

                    System.out.print("Enter Age: ");
                    p.setAge(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    p.setDisease(sc.nextLine());

                    list.add(p);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No patients available.");
                    } else {
                        System.out.println("\nPatient List:");
                        for (Patient pat : list) {
                            System.out.println(
                                "Name: " + pat.getName() +
                                ", Age: " + pat.getAge() +
                                ", Disease: " + pat.getDisease()
                            );
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("No patients to search.");
                    } else {
                        System.out.print("Enter name to search: ");
                        String search = sc.nextLine();
                        boolean found = false;

                        for (Patient pat : list) {
                            if (pat.getName().equalsIgnoreCase(search)) {
                                System.out.println("Patient Found:");
                                System.out.println(
                                    "Name: " + pat.getName() +
                                    ", Age: " + pat.getAge() +
                                    ", Disease: " + pat.getDisease()
                                );
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Patient not found.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}