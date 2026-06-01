package class_assi_day10;


import java.util.*;
 
public class hosptal_comparable implements Comparable<hosptal_comparable> {
int id;
String name;
 
public hosptal_comparable(int id, String name)
{
	this.id=id;
	this.name=name;
}
@Override
public int compareTo(hosptal_comparable p)
{
	return this.id - p.id;
}
@Override
public String toString()
{
	return id + " - " + name;
}
 
public static void main(String[] args)
	{
	TreeSet<hosptal_comparable> patients=new TreeSet<>();
	
	patients.add(new hosptal_comparable(102, "Vinay"));
	patients.add(new hosptal_comparable(101, "Sonali"));
	patients.add(new hosptal_comparable(103, "Radhya"));
	patients.add(new hosptal_comparable(101, "Vinay"));
	
	System.out.println("Unique Registered Patients");
	for(hosptal_comparable p: patients)
	{
		System.out.println(p);
	}
 
	}
 
}
 
 
