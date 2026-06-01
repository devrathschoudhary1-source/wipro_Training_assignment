package class_assin_day12;

import java.io.*;


class Student implements Serializable {
 int id;
 String name;


 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

public class serial {
 public static void main(String[] args) {
     try {
         
         Student s1 = new Student(101, "Rahul");

       
         ObjectOutputStream oos = new ObjectOutputStream(
                 new FileOutputStream("student.ser"));

        
         oos.writeObject(s1);

        
         oos.close();

         System.out.println("Object serialized successfully!");

     } catch (IOException e) {
         System.out.println(e);
     }
 }
}
