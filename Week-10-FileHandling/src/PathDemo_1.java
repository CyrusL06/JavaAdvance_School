import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;



public class PathDemo_1 {
	
	
	
	public static void PathsAttribute()
	{

		Path filePath = Paths.get("../src");
		try {
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Creation time: " + attr.creationTime() + "\n");
			System.out.println("Creation time: " + attr.lastModifiedTime() + "\n");
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		PathsAttribute();
		
			
		Path filePath = Paths.get("Data.txt");
		
		Scanner UsrInput = new Scanner(System.in);
		
		int id;
		double payRate;
		int QUIT = 999;
		String name;
		String s;
		String delimeter = ",";
		
		try {
			
				//This 
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE));
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
	             s = id + delimeter + name + delimeter + payRate;
	             
	             writer.write(s,0,s.length());
	             writer.newLine();
	             
	             System.out.println("Enter mext ID number or " + QUIT + "to quit >>>");
	             id = UsrInput.nextInt();
	         }
			
			writer.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
