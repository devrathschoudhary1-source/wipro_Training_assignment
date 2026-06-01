package class_assi_day8;


import java.util.LinkedList;
import java.util.Scanner;

class members {
    private String name;
    private int age;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class hospital_linkedlist{
    public static void main(String[] args) {

        LinkedList<Patient> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Queue System ---");
            System.out.println("1. Add Patient (Normal)");
            System.out.println("2. Add Emergency Patient (Front)");
            System.out.println("3. Remove Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. View First & Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

               
                case 1:
                    Patient p1 = new Patient();

                    System.out.print("Enter Name: ");
                    p1.setName(sc.nextLine());

                    System.out.print("Enter Age: ");
                    p1.setAge(sc.nextInt());

                    queue.addLast(p1);
                    System.out.println("Patient added to queue.");
                    break;

                
                case 2:
                    Patient p2 = new Patient();

                    System.out.print("Enter Name: ");
                    p2.setName(sc.nextLine());

                    System.out.print("Enter Age: ");
                    p2.setAge(sc.nextInt());

                    queue.addFirst(p2);
                    System.out.println("Emergency patient added at front!");
                    break;

                
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        Patient removed = queue.removeFirst();
                        System.out.println("Removed Patient: " + removed.getName());
                    }
                    break;

                
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        System.out.println("\nPatient Queue:");
                        for (Patient p : queue) {
                            System.out.println(
                                "Name: " + p.getName() +
                                ", Age: " + p.getAge()
                            );
                        }
                    }
                    break;

   
                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("First Patient: " + queue.getFirst().getName());
                        System.out.println("Last Patient: " + queue.getLast().getName());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
