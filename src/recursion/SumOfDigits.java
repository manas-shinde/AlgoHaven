package recursion;

//Take as input str, a number in form of a string.
// Write a recursive function to find the sum of digits in the string.
// Print the value returned.
public class SumOfDigits {
    public static void main(String[] args) {
        String num = "123456789";
        int result = f(num, 0);
        System.out.println("Sum of all the digit inside string " + num + " is : " + result);
    }

    public static int f(String str, int idx) {
        //base case
        if (idx >= str.length()) return 0;

        //self work
        int currentVal = str.charAt(idx) - '0';

        //assumption
        return currentVal + f(str, idx + 1);
    }
}
