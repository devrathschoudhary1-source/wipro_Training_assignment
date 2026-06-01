package class_assi_day11;
import java.io.*;

public class io {

	public static void main(String[] args) throws Exception 
	{
		FileWriter fw = new FileWriter("dev.txt");
		fw.write("hello java io");
		fw.close();
		System.out.println("file written");

	}

}
