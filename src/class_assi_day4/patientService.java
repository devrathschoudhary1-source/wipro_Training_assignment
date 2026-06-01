package class_assi_day4;

import java.util.Scanner;


class patients{
    int id;
    String name;
    int age;
    String illness;

    patientService(int i, String n, int a, String ill) {
        id = i;
        name = n;
        age = a;
        illness = ill;
    }
}


interface PatientService {
    void registerPatient(patients p);
    void showPatients();
}


class PatientServiceImpl implements PatientService {

    patients[] arr = new patients[10];
    int count = 0;

    public void registerPatient(patients p) {
        arr[count] = p;
        count++;
    }

    public void showPatients() {
        System.out.println("\nPatient List:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i].id + " " + arr[i].name + " " + arr[i].age + " " + arr[i].illness);
        }
    }
}


public class patientService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientServiceImpl();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for patient " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Illness: ");
            String illness = sc.next();

            patients p = new patients(id, name, age, illness);
            service.registerPatient(p);
        }

        service.showPatients();
        sc.close();
    }
}