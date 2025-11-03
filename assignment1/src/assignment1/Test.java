package assignment1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("=== MyBigInteger Test Program ===\n Prof Why was this so long :/ \n\n");
        
        // Test 1: Constructor with array
        System.out.println("--- Test 1: Constructor with array ---");
        int[] nums1 = {1, 2, 3, 4, 5};
        MyBigInteger_6 big1 = new MyBigInteger_6(nums1);
        System.out.println("Created from array {1,2,3,4,5}");
        System.out.println("Result: " + big1.toString());
        System.out.println("Expected: 12345");
        System.out.println();
        
        // Test 2: Constructor with String
        System.out.println("--- Test 2: Constructor with String ---");
        MyBigInteger_6 big2 = new MyBigInteger_6("98765");
        System.out.println("Created from string \"98765\"");
        System.out.println("Result: " + big2.toString());
        System.out.println("Expected: 98765");
        System.out.println();
        
        // Test 3: Simple Addition
        System.out.println("--- Test 3: Simple Addition ---");
        MyBigInteger_6 num1 = new MyBigInteger_6("123");
        MyBigInteger_6 num2 = new MyBigInteger_6("456");
        MyBigInteger_6 sum1 = num1.add(num2);
        System.out.println("123 + 456 = " + sum1.toString());
        System.out.println("Expected: 579");
        System.out.println();
        
        // Test 4: Addition with carry
        System.out.println("--- Test 4: Addition with carry ---");
        MyBigInteger_6 num3 = new MyBigInteger_6("999");
        MyBigInteger_6 num4 = new MyBigInteger_6("1");
        MyBigInteger_6 sum2 = num3.add(num4);
        System.out.println("999 + 1 = " + sum2.toString());
        System.out.println("Expected: 1000");
        System.out.println();
        
        // Test 5: Large number addition
        System.out.println("--- Test 5: Large number addition ---");
        MyBigInteger_6 num5 = new MyBigInteger_6("123456789");
        MyBigInteger_6 num6 = new MyBigInteger_6("987654321");
        MyBigInteger_6 sum3 = num5.add(num6);
        System.out.println("123456789 + 987654321 = " + sum3.toString());
        System.out.println("Expected: 1111111110");
        System.out.println();
        
        // Test 6: Simple Subtraction
        System.out.println("--- Test 6: Simple Subtraction ---");
        MyBigInteger_6 num7 = new MyBigInteger_6("500");
        MyBigInteger_6 num8 = new MyBigInteger_6("200");
        MyBigInteger_6 diff1 = num7.sub(num8);
        System.out.println("500 - 200 = " + diff1.toString());
        System.out.println("Expected: 300");
        System.out.println();
        
        // Test 7: Subtraction with borrow
        System.out.println("--- Test 7: Subtraction with borrow ---");
        MyBigInteger_6 num9 = new MyBigInteger_6("1000");
        MyBigInteger_6 num10 = new MyBigInteger_6("999");
        MyBigInteger_6 diff2 = num9.sub(num10);
        System.out.println("1000 - 999 = " + diff2.toString());
        System.out.println("Expected: 1");
        System.out.println();
        
        // Test 8: Simple Multiplication
        System.out.println("--- Test 8: Simple Multiplication ---");
        MyBigInteger_6 num11 = new MyBigInteger_6("12");
        MyBigInteger_6 num12 = new MyBigInteger_6("11");
        MyBigInteger_6 product1 = num11.mul(num12);
        System.out.println("12 * 11 = " + product1.toString());
        System.out.println("Expected: 132");
        System.out.println();
        
        // Test 9: Larger Multiplication
        System.out.println("--- Test 9: Larger Multiplication ---");
        MyBigInteger_6 num13 = new MyBigInteger_6("123");
        MyBigInteger_6 num14 = new MyBigInteger_6("456");
        MyBigInteger_6 product2 = num13.mul(num14);
        System.out.println("123 * 456 = " + product2.toString());
        System.out.println("Expected: 56088");
        System.out.println();
        
        // Test 10: Multiplication with 0
        System.out.println("--- Test 10: Multiplication with 0 ---");
        MyBigInteger_6 num15 = new MyBigInteger_6("999");
        MyBigInteger_6 num16 = new MyBigInteger_6("0");
        MyBigInteger_6 product3 = num15.mul(num16);
        System.out.println("999 * 0 = " + product3.toString());
        System.out.println("Expected: 0");
        System.out.println();
        
        // Test 11: Simple Division
        System.out.println("--- Test 11: Simple Division ---");
        MyBigInteger_6 num17 = new MyBigInteger_6("10");
        MyBigInteger_6 num18 = new MyBigInteger_6("2");
        String quotient1 = num17.div(num18);
        System.out.println("10 / 2 = " + quotient1);
        System.out.println("Expected: 5");
        System.out.println();
        
        // Test 12: Division with decimal
        System.out.println("--- Test 12: Division with decimal ---");
        MyBigInteger_6 num19 = new MyBigInteger_6("10");
        MyBigInteger_6 num20 = new MyBigInteger_6("3");
        String quotient2 = num19.div(num20);
        System.out.println("10 / 3 = " + quotient2);
        System.out.println("Expected: 3.333...");
        System.out.println();

        
        // Test 13: Reverse entire list
        System.out.println("--- Test 14: Reverse entire list ---");
        MyBigInteger_6 num23 = new MyBigInteger_6("12345");
        System.out.println("Original: " + num23.toString());
        num23.reverse();
        System.out.println("After reverse(): " + num23.toString());
        System.out.println("Expected: 54321");
        System.out.println();
        
        // Test 14: Reverse range
        System.out.println("--- Test 15: Reverse range ---");
        MyBigInteger_6 num24 = new MyBigInteger_6("123456789");
        System.out.println("Original: " + num24.toString());
        num24.reverse(2, 6);
        System.out.println("After reverse(2, 6): " + num24.toString());
        System.out.println("Expected: 127654389");
        System.out.println();
        
        // Test 15: Add digit at head
        System.out.println("--- Test 16: Add digit at head ---");
        MyBigInteger_6 num25 = new MyBigInteger_6("123");
        System.out.println("Original: " + num25.toString());
        num25.add(9);
        System.out.println("After add(9): " + num25.toString());
        System.out.println("Expected: 9123");
        System.out.println();
        
        // Test 16: Add digit at index
        System.out.println("--- Test 17: Add digit at index ---");
        MyBigInteger_6 num26 = new MyBigInteger_6("123");
        System.out.println("Original: " + num26.toString());
        num26.add(2, 9);
        System.out.println("After add(2, 9): " + num26.toString());
        System.out.println("Expected: 1293");
        System.out.println();
        
        // Test 17: Remove digit
        System.out.println("--- Test 18: Remove digit ---");
        MyBigInteger_6 num27 = new MyBigInteger_6("12345");
        System.out.println("Original: " + num27.toString());
        num27.remove(2);
        System.out.println("After remove(2): " + num27.toString());
        System.out.println("Expected: 1245");
        System.out.println();
        
        // Test 18: Invalid index error
        System.out.println("--- Test 19: Invalid index error ---");
        MyBigInteger_6 num28 = new MyBigInteger_6("123");
        System.out.println("Original: " + num28.toString());
        System.out.println("Trying to remove index 10 (invalid):");
        num28.remove(10);
        System.out.println("Expected: Error message");
        System.out.println();
        
        // Test 19: Very large numbers
        System.out.println("--- Test 20: Very large numbers ---");
        MyBigInteger_6 large1 = new MyBigInteger_6("999999999999999999");
        MyBigInteger_6 large2 = new MyBigInteger_6("1");
        MyBigInteger_6 largeSum = large1.add(large2);
        System.out.println("999999999999999999 + 1 = " + largeSum.toString());
        System.out.println("Expected: 1000000000000000000");
        System.out.println();
        
        System.out.println("=== All Tests Completed Successfully! ===");
	}

}
