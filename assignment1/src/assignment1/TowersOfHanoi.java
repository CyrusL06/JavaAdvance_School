package assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class TowersOfHanoi {

    private int totalDisks;
    private int[] peg1;
    private int[] peg2;
    private int[] peg3;
    private int top1, top2, top3;
    private int moveCount;

    public TowersOfHanoi(int disks) {
        totalDisks = disks;
        peg1 = new int[disks];
        peg2 = new int[disks];
        peg3 = new int[disks];
        moveCount = 0;
        
        // Put all disks on peg 1
        for (int i = 0; i < disks; i++) {
            peg1[i] = disks - i;
        }
        top1 = disks;
        top2 = 0;
        top3 = 0;
    }

    public void solve() {
        System.out.println("Initial State:");
        displayArrays();
        System.out.println();
        
        moveTower(totalDisks, "1", "3", "2");
        
        System.out.println("\n=== Puzzle Solved! ===");
        System.out.println("Final State:");
        displayArrays();
        System.out.println("\nTotal moves: " + moveCount);
    }

    public void moveTower(int numDisks, String start, String end, String temp) {
        if (numDisks == 1) {
            actualMove(start, end);
        } else {
            moveTower(numDisks - 1, start, temp, end);
            actualMove(start, end);
            moveTower(numDisks - 1, temp, end, start);
        }
    }
    
    // Actually move the disk
    private void actualMove(String from, String to) {
        int disk = 0;
        
        // Remove disk from source
        if (from.equals("1")) {
            disk = peg1[top1 - 1];
            peg1[top1 - 1] = 0;
            top1--;
        } else if (from.equals("2")) {
            disk = peg2[top2 - 1];
            peg2[top2 - 1] = 0;
            top2--;
        } else {
            disk = peg3[top3 - 1];
            peg3[top3 - 1] = 0;
            top3--;
        }
        
        // Add disk to destination
        if (to.equals("1")) {
            peg1[top1] = disk;
            top1++;
        } else if (to.equals("2")) {
            peg2[top2] = disk;
            top2++;
        } else {
            peg3[top3] = disk;
            top3++;
        }
        
        moveCount++;
        System.out.println("Move " + moveCount + ": Move disk " + disk + 
                           " from peg " + from + " to peg " + to);
        displayArrays();
        System.out.println();
    }
    
    // Display arrays
    private void displayArrays() {
        System.out.println("Peg 1 array: " + Arrays.toString(peg1) + " (top index: " + top1 + ")");
        System.out.println("Peg 2 array: " + Arrays.toString(peg2) + " (top index: " + top2 + ")");
        System.out.println("Peg 3 array: " + Arrays.toString(peg3) + " (top index: " + top3 + ")");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Tower of Hanoi - Array Representation ===");
        System.out.print("Enter number of disks (1-5): ");
        int disks = input.nextInt();
        
        if (disks < 1 || disks > 5) {
            System.out.println("Please enter between 1 and 5");
            input.close();
            return;
        }
        
        System.out.println();
        TowersOfHanoi towers = new TowersOfHanoi(disks);
        towers.solve();
        
        input.close();
    }
}