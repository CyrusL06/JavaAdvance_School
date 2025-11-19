import java.util.Scanner;

public class IntroToJava_0 {

	

	
	
	public static void displayArrayNum()
	{
		int row = 3;
		int col = 4;
		int [][] arr = new int [row][col];
		
		for(int i = 0; i <= row; i++)
		{
			for (int j = 0; j <= col; j++) 
			{
				System.out.print(arr[i][j]);
			}
			
			System.out.println();			
		}
	}
	
	
	public static void displayArrayDrawing()
	{
		String s = "* ";
		int row = 3;
		int col = 4;
		//need to make this string
		String [][] arr = new String [row][col];
		
		for(int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++) 
			{
				arr[i][j] = s;
				System.out.print(arr[i][j]);
			}
			
			System.out.println();

			
		}
	}
	
	
	public static void UsrIndisplayArrayDrawing()
	{
		Scanner UsrInp= new Scanner(System.in);
		
		System.out.println("How Big do you want the drawing to be?");
		int row = UsrInp.nextInt();
		
		String s = "* ";
		
//		int row = 3;
		int col = row;
		//need to make this string
		String [][] arr = new String [row][col];
		
		
		display2DArr(row,col,arr,s);
		
		System.out.println("Which x,y position do you want to place?");
		String[] positon = UsrInp.next().split(",");
		//splits the two input into x, and y 
		int x = Integer.parseInt(positon[0]);
		int y = Integer.parseInt(positon[1]);
		
		AccessDrawingXnY( row, col, s, x,y,arr);
		
//		display2DArr(row,col,arr,s);

		
	}
	
	public static void display2DArr(int row, int col, String[][] arr , String s)
	{
		
		for(int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++) 
			{
				
				arr[i][j] = s;
				System.out.print(arr[i][j]);
			}
			
			System.out.println();

		}
		
	}
	
	//l1 row
	//l2 col
		//l3
	
	public static void AccessDrawingXnY( int row, int col, String s, int x, int y, String [][] arr)
	{
//		int x = 2;
//		int y = 2;
		
		System.out.println("X is: " + x + "\nY is: " + y);
		System.out.println();
		String z = "Y";
		String[][] newDisp = new String [row][col];
//		2,2
		
		
		int xcounter = 0;
		int ycounter = 0;;

		
				
		for (int i = 0; i < row; i++)
		{
			
			for (int j = 0; j < col; j++)
			{
				
				System.out.println(newDisp[i][j]);
//				System.out.print(arr[i][j]);
				while(x == xcounter)
				{
					while (y == ycounter)
					{
						newDisp[x][y] = z;
					}
				}
				
		//We need to print out the result after
				
			//Loop through again but we can

			}
		
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
		String s1;
		s1 = new String();
		
		
		//When this is execited object are initializa to the effect 
		//that the new String object repeesens the string "transparent"
		String s2 = new String ("transparent");
		
		
		System.out.println(s1);
		System.out.println(s1.length());

		
		System.out.println(s2);
		System.out.println(s2.length());
		
		
		String s4 = new String ("restful"),
				s5 = new String("restful"),
				s6 = new String ("peaceful"),
				s7= s4,
				s8 ="restful",
				s9 = "restful";


		System.out.println(  s4.equals (s5)); 	// the output is'true"
		System.out.println(  s4. equals (s6)) ; // the output false"
		System.out.println(  s4 == s5) ; // the output false"
		System.out.println(  s4 == s7) ;// the output is'false"
		System.out.println(  s4 == s8) ;// the output false"
		System.out.println(  s8 == s9);// the output is'false"
	
	
	*/
		
//		splitWithDelim("here today gone tomorrow");
		displayArrayDrawing();
		System.out.println("____________\n");

		UsrIndisplayArrayDrawing();
		
		
		
	}
	
	
	public static void split (String line)
	{
		Scanner sc = new Scanner(line);
		
		while(sc.hasNext())
			System.out.println(sc.next().toLowerCase()); //method splits
		
		split("here today gone tomorrow");

	}
	
	public static void splitWithDelim (String line)
	{
		Scanner sc = new Scanner(line).useDelimiter("[^a-zA-Z]+") ;
		//bracket specifies the character
		while(sc.hasNext())
		System.out.println(sc.next().toLowerCase()); //method splits

	}

}



