package assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class Tow_Complement_Rep_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner UsrInp= new Scanner(System.in);

        System.out.println();
        System.out.println("Enter a number: ");
        int x = UsrInp.nextInt();
        
        int[] binary = binaryCal(x);
        
        System.out.println("Original binary: " + Arrays.toString(binary));
        
        int[] newNum = TowsCompliment(binary);

        System.out.println("Two's complement: " + Arrays.toString(newNum));
        
        UsrInp.close();
    }


    public static int[] binaryCal(int x) {
        int[] initial = new int[8];

        for (int i = 0; i < 8; i++) {
            if (x % 2 == 0) {
                x = x / 2;
                initial[i] = 0;
            } else {
                x = (x - 1) / 2;
                initial[i] = 1;
            }
        }

        return initial;
    }


    // 1.Goal convert opposite and add 1
    public static int[] TowsCompliment(int[] binary) {
        int counter = 0;
        int binaryCoun = 8;

        int[] store = new int[8];

        // Step 1: Flip all bits
        while (counter < binaryCoun) {
            int digit = binary[counter];
            
            switch (digit) {
                case 0:
                    store[counter] = 1;
                    System.out.println(store[counter] + " New " + counter);
                    break;
                case 1:
                    store[counter] = 0;
                    System.out.println(store[counter] + " New " + counter);
                    break;
            }
            counter++;
        }
        
        // Step 2: Add 1 to the flipped bits
        int carry = 1;
        for (int i = 0; i < 8; i++) {
            int sum = store[i] + carry;
            store[i] = sum % 2;
            carry = sum / 2;
            
            if (carry == 0) break; // No more carry, done
        }
        
        return store;
    }
}