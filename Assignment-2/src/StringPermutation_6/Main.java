package StringPermutation_6;

import java.util.Scanner;

public class Main {
	 public static void printPermutations(String str, String ans) {
	        // Base case: If the input string is empty, we have found a complete permutation
	        if (str.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        // Iterate through each character of the input string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i); // Get the current character
	            
	            // Create the remaining string by excluding the current character
	            String remainingStr = str.substring(0, i) + str.substring(i + 1);
	            
	            // Recursive call: find permutations of the remaining string,
	            // appending the current character to the accumulated answer
	            printPermutations(remainingStr, ans + ch);
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner usrinp = new Scanner(System.in);
	        System.out.println("Insert String of Value");
	        String input = usrinp.next();
	        System.out.println("Permutations of \"" + input + "\":");
	        printPermutations(input, ""); // Start with an empty accumulated answer
	    }
}

