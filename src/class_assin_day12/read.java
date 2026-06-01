package class_assin_day12;



import java.io.*;
import java.io.IOException;
 
public class read {
public static void main(String[] args)
	{
 
		try {
			FileReader reader = new FileReader("wip.txt");
            int ch;
            StringBuilder content = new StringBuilder();
            
            while((ch=reader.read()) !=-1)
            {
       
            content.append((char) ch);
            }
			reader.close();
			System.out.println(content.toString());

			}
	

 
		 	catch(IOException e)
            {
            	System.out.println(e);
            }
	}
	}
 