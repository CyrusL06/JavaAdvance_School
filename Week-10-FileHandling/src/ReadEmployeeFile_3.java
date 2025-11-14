import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadEmployeeFile_3 {

	
	
	public static void NormalFileRRead()
	{
		Path filePath = Paths.get("Data.txt");
		String s;
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(filePath));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			s = reader.readLine();
			while(s != null)
			{
				System.out.println(s);
				s=reader.readLine();
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void CalculateFileRead()
	{
		Path filePath = Paths.get("Data.txt");
		String s;
		
		String[] array = new String[3];
		String delimiter = ",";
		int id;
		String name;
		double payRate;
		double gross;
		final double HRS_IN_WEEK = 40;
		double total = 0;
		
		
		
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(filePath));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			System.out.println();

			s = reader.readLine();
			while(s != null)
			{
				//Key Difference the splitter
				array = s.split(delimiter);
				//the array[0] is 
				id = Integer.parseInt(array[0]);
				name = array[1];
				
				payRate = Double.parseDouble(array[2]);
				gross = payRate * HRS_IN_WEEK;
				System.out.println("ID#" + id + " " + name +
						"  $" + payRate + "  $" + gross);
				total += gross;
				
		
				s=reader.readLine();
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The total geoss payroll is: $" + total);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 NormalFileRRead();
		CalculateFileRead();
		
	}

}
