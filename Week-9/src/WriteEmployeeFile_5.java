//without this CREATE becomes an error
import static java.nio.file.StandardOpenOption.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

import java.util.Scanner;

public class WriteEmployeeFile_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UsrInput = new Scanner (System.in);
		Path file = Paths.get("Employees.txt");
		String s = "";
		String delimiter = ",";
		int id;
		String name;
		double payRate;
		final int QUIT = 999;
		
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
	         System.out.print("Enter employee ID number >> ");
	         id = UsrInput.nextInt();
	         while (id != QUIT) 
	         {
	        	 System.out.print("Enter name for employee #" + id + " >> ");
	        	 UsrInput.nextLine();
	             name = UsrInput.nextLine();
	             System.out.print("Enter pay rate >> ");
	             payRate = UsrInput.nextDouble();
	             s = id + delimiter + name + delimiter + payRate;
	             
	             writer.write(s,0,s.length());
	             writer.newLine();
	             
	             System.out.println("Enter mext ID number or " + QUIT + "to quit >>>");
	             id = UsrInput.nextInt();
	         }
	         
	         writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Message: " + e);
			e.printStackTrace();
		}
		
		
		
	}

}
