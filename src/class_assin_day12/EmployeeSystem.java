package class_assin_day12;

import java.io.*;


class Employee implements Serializable {
 int id;
 String name;
 double salary;

 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 public String toString() {
     return id + " " + name + " " + salary;
 }
}


public class EmployeeSystem {

 public static void main(String[] args) {

     
     Employee e1 = new Employee(101, "Ram", 50000);
     Employee e2 = new Employee(102, "Shyam", 60000);

     
     try {
         FileOutputStream fos = new FileOutputStream("employees.dat");
         ObjectOutputStream oos = new ObjectOutputStream(fos);

         oos.writeObject(e1);
         oos.writeObject(e2);

         oos.close();
         fos.close();

         System.out.println("✅ Employees saved successfully!");

     } catch (IOException e) {
         e.printStackTrace();
     }


     try {
         FileInputStream fis = new FileInputStream("employees.dat");
         ObjectInputStream ois = new ObjectInputStream(fis);

         System.out.println("\n📄 Employee Records:");

         Employee emp1 = (Employee) ois.readObject();
         Employee emp2 = (Employee) ois.readObject();

         System.out.println(emp1);
         System.out.println(emp2);

         ois.close();
         fis.close();

     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}