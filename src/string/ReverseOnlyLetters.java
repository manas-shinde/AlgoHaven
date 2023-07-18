package string;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String str = "Test1ng-Leet=code-Q!";

        System.out.println("Original String - " + str);

        String result = reverseOnlyLetters(str);
        System.out.println(result.equals("Qedo1ct-eeLg=ntse-T!"));
        System.out.println("After reversing the letters - " + result);

    }

    /**
     * Reverses only the letters in a given string while keeping non-letter characters in their original positions.
     *
     * @param s The input string to reverse.
     * @return The string with letters reversed and non-letter characters unchanged.
     */
    public static String reverseOnlyLetters(String s) {
        int start = 0, end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (start < end) {
            // Find the next letter from the start
            while (start < end && !Character.isLetter(s.charAt(start)))
                start++;

            // Find the next letter from the end
            while (start < end && !Character.isLetter(s.charAt(end)))
                end--;

            // Swap the letters at start and end positions
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);

            // Move the indices towards the center
            start++;
            end--;
        }

        return sb.toString();
    }

}
