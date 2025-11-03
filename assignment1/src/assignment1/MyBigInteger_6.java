package assignment1;

public class MyBigInteger_6 {
    // Array to store digits
    private int[] digits;
    private int size;
    
    // Constructor using array of integers
    public MyBigInteger_6(int[] nums) {
        digits = new int[nums.length];
        size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            digits[i] = nums[i];
        }
    }
    
    // Constructor using String
    public MyBigInteger_6(String nums) {
        size = 0;
        digits = new int[nums.length()];
        for (int i = 0; i < nums.length(); i++) {
            if (Character.isDigit(nums.charAt(i))) {
                digits[size] = Character.getNumericValue(nums.charAt(i));
                size++;
            }
        }
    }
    
    // Add a digit to the beginning (head)
    public void add(int digit) {
        int[] newArray = new int[size + 1];
        newArray[0] = digit;
        for (int i = 0; i < size; i++) {
            newArray[i + 1] = digits[i];
        }
        digits = newArray;
        size++;
    }
    
    // Add digit after the (index-1)th position
    public void add(int index, int digit) {
        if (index < 0 || index > size) {
            System.out.println("Error: Invalid index " + index);
            return;
        }
        
        int[] newArray = new int[size + 1];
        
        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArray[i] = digits[i];
        }
        
        // Insert new digit
        newArray[index] = digit;
        
        // Copy elements after index
        for (int i = index; i < size; i++) {
            newArray[i + 1] = digits[i];
        }
        
        digits = newArray;
        size++;
    }
    
    // Remove the index-th digit
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error: Invalid index " + index);
            return;
        }
        
        int[] newArray = new int[size - 1];
        
        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArray[i] = digits[i];
        }
        
        // Copy elements after index
        for (int i = index + 1; i < size; i++) {
            newArray[i - 1] = digits[i];
        }
        
        digits = newArray;
        size--;
    }
    
    // Reverse the entire array
    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[size - 1 - i];
            digits[size - 1 - i] = temp;
        }
    }
    
    // Reverse from start index to end index
    public void reverse(int start, int end) {
        if (start < 0 || end >= size || start >= end) {
            System.out.println("Error: Invalid range [" + start + ", " + end + "]");
            return;
        }
        
        while (start < end) {
            int temp = digits[start];
            digits[start] = digits[end];
            digits[end] = temp;
            start++;
            end--;
        }
    }
    
    // Show all digits
    public String toString() {
        if (size == 0) return "0";
        
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + digits[i];
        }
        return result;
    }
    
    // Add two big integers
    public MyBigInteger_6 add(MyBigInteger_6 bigInt) {
        int len1 = this.size;
        int len2 = bigInt.size;
        int maxLength = len1;
        if (len2 > maxLength) {
            maxLength = len2;
        }
        
        int[] resultArray = new int[maxLength + 1];
        int carry = 0;
        
        // Add from right to left
        for (int i = 0; i < maxLength || carry > 0; i++) {
            int digit1 = 0;
            int digit2 = 0;
            
            // Get digit from first number
            if (len1 - 1 - i >= 0) {
                digit1 = this.digits[len1 - 1 - i];
            }
            
            // Get digit from second number
            if (len2 - 1 - i >= 0) {
                digit2 = bigInt.digits[len2 - 1 - i];
            }
            
            int sum = digit1 + digit2 + carry;
            resultArray[maxLength - i] = sum % 10;
            carry = sum / 10;
        }
        
        // Handle carry
        if (carry > 0) {
            resultArray[0] = carry;
            return new MyBigInteger_6(resultArray);
        } else {
            int[] finalArray = new int[maxLength];
            for (int i = 0; i < maxLength; i++) {
                finalArray[i] = resultArray[i + 1];
            }
            return new MyBigInteger_6(finalArray);
        }
    }
    
    // Subtract big integer
    public MyBigInteger_6 sub(MyBigInteger_6 bigInt) {
        int[] resultArray = new int[this.size];
        int borrow = 0;
        
        // Subtract from right to left
        for (int i = 0; i < this.size; i++) {
            int digit1 = this.digits[this.size - 1 - i] - borrow;
            int digit2 = 0;
            
            if (bigInt.size - 1 - i >= 0) {
                digit2 = bigInt.digits[bigInt.size - 1 - i];
            }
            
            if (digit1 < digit2) {
                digit1 = digit1 + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            
            resultArray[this.size - 1 - i] = digit1 - digit2;
        }
        
        // Remove leading zeros
        int startIndex = 0;
        while (startIndex < resultArray.length - 1 && resultArray[startIndex] == 0) {
            startIndex++;
        }
        
        int[] finalArray = new int[resultArray.length - startIndex];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = resultArray[startIndex + i];
        }
        
        return new MyBigInteger_6(finalArray);
    }
    
    // Multiply two big integers
    public MyBigInteger_6 mul(MyBigInteger_6 bigInt) {
        int[] resultArray = new int[this.size + bigInt.size];
        
        // Multiply each digit
        for (int i = this.size - 1; i >= 0; i--) {
            for (int j = bigInt.size - 1; j >= 0; j--) {
                int product = this.digits[i] * bigInt.digits[j];
                int position1 = i + j;
                int position2 = i + j + 1;
                
                int sum = product + resultArray[position2];
                resultArray[position2] = sum % 10;
                resultArray[position1] = resultArray[position1] + sum / 10;
            }
        }
        
        // Remove leading zeros
        int startIndex = 0;
        while (startIndex < resultArray.length - 1 && resultArray[startIndex] == 0) {
            startIndex++;
        }
        
        int[] finalArray = new int[resultArray.length - startIndex];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = resultArray[startIndex + i];
        }
        
        return new MyBigInteger_6(finalArray);
    }
    
    // Divide with precision up to 100 digits after decimal
    public String div(MyBigInteger_6 bigInt) {
        if (bigInt.toString().equals("0")) {
            return "Error: Division by zero";
        }
        
        String result = "";
        MyBigInteger_6 dividend = new MyBigInteger_6(this.toString());
        MyBigInteger_6 divisor = new MyBigInteger_6(bigInt.toString());
        
        // Integer part
        int quotient = 0;
        while (isGreaterOrEqual(dividend, divisor)) {
            dividend = dividend.sub(divisor);
            quotient++;
        }
        result = result + quotient;
        
        // Decimal part (up to 100 digits)
        if (!dividend.toString().equals("0")) {
            result = result + ".";
            for (int i = 0; i < 100; i++) {
                dividend = new MyBigInteger_6(dividend.toString() + "0");
                quotient = 0;
                while (isGreaterOrEqual(dividend, divisor)) {
                    dividend = dividend.sub(divisor);
                    quotient++;
                }
                result = result + quotient;
                if (dividend.toString().equals("0")) {
                    break;
                }
            }
        }
        
        return result;
    }
    
    // Helper: check if first number >= second number
    private boolean isGreaterOrEqual(MyBigInteger_6 num1, MyBigInteger_6 num2) {
        String str1 = num1.toString();
        String str2 = num2.toString();
        
        if (str1.length() > str2.length()) {
            return true;
        }
        if (str1.length() < str2.length()) {
            return false;
        }
        
        // Same length, compare digit by digit
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) > str2.charAt(i)) {
                return true;
            }
            if (str1.charAt(i) < str2.charAt(i)) {
                return false;
            }
        }
        return true; // They are equal
    }
}