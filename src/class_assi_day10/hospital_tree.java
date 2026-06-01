package class_assi_day10;

import java.util.*;

class member {
    String name;
    int age;
    String disease;

    member (String n, int a, String d) {
        name = n;
        age = a;
        disease = d;
    }

    public String toString() {
        return name + " " + age + " " + disease;
    }
}

public class hospital_tree {
    static TreeMap<String, Patient> tm = new TreeMap<>();

    public static void main(String[] args) {

        // Add patients
        tm.put("P3", new Patient("Ram", 25, "Flu"));
        tm.put("P1", new Patient("Shyam", 30, "Cold"));
        tm.put("P2", new Patient("Kishan", 40, "Fever"));

        // Update patient
        tm.get("P1").age = 31;

        // Retrieve patient
        System.out.println("P1: " + tm.get("P1"));

        // Check existence
        System.out.println("Exists P2? " + tm.containsKey("P2"));

        // List all patients (sorted by ID automatically)
        for (Map.Entry<String, Patient> e : tm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Count patients
        System.out.println("Total Patients: " + tm.size());

        // Remove patient
        tm.remove("P2");

        // Clear system
        tm.clear();
    }
}
