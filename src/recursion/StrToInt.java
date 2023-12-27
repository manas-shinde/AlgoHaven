package recursion;

/*
Take as input str, a number in form of a string.
Write a recursive function to convert the number in string form to number in integer form.
E.g. for “1234” return 1234.
Print the value returned.
 */
public class StrToInt {
    public static void main(String[] args) {
        String s = "1234";
        int result = strToInt(s);
        System.out.println(result);
    }

    public static int strToInt(String str) {
        return strToIntRecursive(str, 0);
    }

    public static int strToIntRecursive(String str, int idx) {
        //base case
        if (idx >= str.length()) return 0;

        //self work
        // Calculate the value of the current digit
        int digitValue = str.charAt(idx) - '0';

        //assumption
        // Combine the current digit value with the remaining value
        return digitValue * (int) Math.pow(10, str.length() - idx - 1) + strToIntRecursive(str, idx + 1);
    }
}
