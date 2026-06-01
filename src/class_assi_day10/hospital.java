package class_assi_day10;


import java.util.*;



class Patient {
    String name;
    int age;
    String disease;

    Patient(String n, int a, String d) {
        name = n;
        age = a;
        disease = d;
    }

    public String toString() {
        return name + " " + age + " " + disease;
    }
}

public class hospital {
    static HashMap<String, Patient> hm = new HashMap<>();

    public static void main(String[] args) {

        
   hm.put("P1", new Patient("Ram", 25, "Flu"));
   hm.put("P2", new Patient("Shyam", 30, "Cold"));


  hm.get("P1").age = 26;

      
   System.out.println("P1: " + hm.get("P1"));

 
    System.out.println("Exists P2? " + hm.containsKey("P2"));

 
   for (Map.Entry<String, Patient> e : hm.entrySet()) {
   System.out.println(e.getKey() + " -> " + e.getValue());
        }

        
    System.out.println("Total Patients: " + hm.size());

       
     hm.remove("P2");

        
     hm.clear();
    }
}
