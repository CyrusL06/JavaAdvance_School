import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class CreateRandomAccessEmployeeData_4 {

	
	public static void CreateRandomAccessEmployeeFile()
	
	{
		Path file = Paths.get("RandomEmployee.txt");
		
		//Spacing needs to be exact 7 to work...
		String s = "000,       ,00.00" + 
				System.lineSeparator();
		
		
		
		byte [] data = s.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(data);
		final int NUMERCS = 10;
		
		//GOAL IS TO WRITE FILE AND CREATE
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			
			//NOW you need to loop into file 10 times and create that template
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			
			for (int i = 0; i < NUMERCS; i++)
			{
				writer.write(s, 0, s.length());
//				System.out.println();

			}
			writer.close();

			System.out.print("DONE");
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void IndexPositionInsertString()
	{
		//Challenge based on the position of the element input strings insisde
				Path file = Paths.get("RandomEmployee.txt");
				String s = "002,Newmann,22.25" + System.lineSeparator();
				
				
				final int RECSIZE = s.length();
				//stores the bytes data
				byte [] data = s.getBytes();
				
				ByteBuffer buffer = ByteBuffer.wrap(data);
				//maps through
				FileChannel fc = null;
				
				
				try {
					
					fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
					//Position 2 is a set to 2 times the size of each record
					fc.position(2 * RECSIZE);
					fc.write(buffer);
					fc.close();
				
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	     
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		CreateRandomAccessEmployeeFile();
		// IndexPositionInsertString();
		
		
		
		
		Path file = Paths.get("RandomEmployee.txt");
		String s = "000,       ,00.00"; 
		Scanner	UsrInp = new Scanner(System.in);
		final int RECSIZE = s.length();
		FileChannel fc = null;

		int id;
		double payRate;
		final int QUIT = 999;
		String name;
		String idString;
		String delimeter = ",";
		
		//stores the bytes data
		//maps through
		
		
		try {
			
			fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
			//Position 2 is a set to 2 times the size of each record
			
			System.out.println("Enter employee ID number or ");
			//Turn the int to String
			id = UsrInp.nextInt();
			
			while(id != QUIT)
			{
				//We need the ID here to be displayed...
			
				System.out.println("Enter employee name for employee # " + id );
//				name = UsrInp.nextLine();
				name = UsrInp.next();

				System.out.println("Enter payRate for " + name );
				payRate = UsrInp.nextDouble();
				
				
				s = id + delimeter + name + delimeter + payRate + System.lineSeparator() ;
				byte [] data = s.getBytes();
				ByteBuffer buffer = ByteBuffer.wrap(data);
					
				fc.position(id * RECSIZE);
				fc.write(buffer);
			
				buffer.rewind();
				
				System.out.println("Enter employee ID number or " + QUIT + ">>" );
			
		    id = UsrInp.nextInt();
			}
			
			fc.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Eror");
		}
		
		
		
		
	}

}
