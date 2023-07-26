package string;

public class ReverseWords3 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println("Original String : " + str);

        String reverseWordsString = reverseWords(str);
        System.out.println("Reverse word string : " + reverseWordsString);
    }

    /**
     * Reverses each word in the input string while preserving the word order.
     * <p>
     * This function takes a string 's' as input and returns a new string where each word
     * in the input string is reversed. Words are separated by spaces. The function
     * maintains the original order of words in the output string.
     *
     * @param s The input string to be processed.
     * @return A new string with each word in the input string reversed while preserving
     * the order of words.
     * <p>
     * @example // Example 1
     * String input1 = "Hello World";
     * String result1 = reverseWords(input1);
     * // result1 = "olleH dlroW"
     * <p>
     * // Example 2
     * String input2 = "Java is fun!";
     * String result2 = reverseWords(input2);
     * // result2 = "avaJ si !nuf"
     */
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            String currentString = str[i];

            for (int j = currentString.length() - 1; j >= 0; j--) {
                sb.append(currentString.charAt(j));
            }
            if (i != str.length - 1) sb.append(' ');
        }
        return sb.toString();
    }
}
