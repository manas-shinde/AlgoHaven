package string;

public class LargestOddNumber {
    public static void main(String[] args) {
        String str = "35722";
        System.out.println(largestOddNumber(str));
    }

    /**
     * Finds the largest odd number from a given string representation of a number.
     *
     * @param num The input string representation of a number.
     * @return The largest odd number found in the string.
     */
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                // Found the first odd digit from the right, return the substring from the start to i+1
                return num.substring(0, i + 1);
            }
        }

        // No odd digits found, return an empty string
        return "";
    }

}
