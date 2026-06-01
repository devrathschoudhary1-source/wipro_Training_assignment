package class_assin_day12;

import java.io.*;
import java.util.*;

class Patient {
    String id, name, disease;
    int age;

    Patient(String id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
}

class hospital {

    
    public static void addPatient(String id, String name, int age, String disease) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("patients.txt", true))) {
            bw.write(id + "," + name + "," + age + "," + disease);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static void addReport(String rid, String pid, String treatment, double bill) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reports.txt", true))) {
            bw.write(rid + "," + pid + "," + treatment + "," + bill);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static void readFile(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}


public class HospitalSystem {
    public static void main(String[] args) {

        
        hospital.addPatient("P101", "Ram", 45, "Diabetes");
        hospital.addPatient("P102", "Shyam", 30, "Fever");

        
        hospital.addReport("R1", "P101", "Metformin", 1500);
        hospital.addReport("R2", "P102", "Paracetamol", 500);

      
        System.out.println("Patient Records:");
        hospital.readFile("patients.txt");

        System.out.println("\nMedical Reports:");
        hospital.readFile("reports.txt");
    }
}
