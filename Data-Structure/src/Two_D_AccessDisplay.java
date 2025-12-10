import java.util.Scanner;

public class Two_D_AccessDisplay {

    static String[][] arr; // Make array accessible to all methods

    public static void Start()
    {
        int col = 5;
        int row = 5;
        String s = "* ";

        arr = new String[row][col]; // Initialize the class-level array

        for (int i = 0; i < row; i++) // Changed from col to row
        {
            for (int j = 0; j < col; j++) // Changed from row to col
            {
                arr[i][j] = s;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void AccessPoint(int row, int col, String newValue)
    {
    	//To fix the position placement since arr starts at 0
    	 arr[row-1][col-1] = newValue; // Change the value at position [row][col]
         System.out.println("Changed position [" + row + "][" + col + "] to: " + newValue);
    	

    public static void Display()
    {
        // Display the current array
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

	public static void main(String[] args)
    {
        Scanner __UsrInput__ = new Scanner(System.in);
        
        Start(); // Display initial array
        
//        System.out.println("\nWhat row position do you want to access? (0-4)");
        int row = __UsrInput__.nextInt();
        
        System.out.println("What column position do you want to access? (0-4)");
        int col = __UsrInput__.nextInt();
        
        // Change position [2][2] to "Y "
        AccessPoint(row, col, "Y ");
        
        System.out.println("\nUpdated array:");
        Display(); // Display updated array
        
        __UsrInput__.close();
    }
}