package string;

public class HalvesAreAlike {
    public static void main(String[] args) {
        String str = "book";

        System.out.println(halvesAreAlike(str));
    }

    /**
     * Checks if two halves of a string have an equal number of vowels.
     * <p>
     * The method takes a string 's' as input and divides it into two halves.
     * It then counts the number of vowels in each half and checks if they are equal.
     *
     * @param s The input string to be checked.
     * @return True if the two halves have an equal number of vowels; otherwise, false.
     */
    public static boolean halvesAreAlike(String s) {
        int start = 0, end = s.length() - 1;
        int first = 0, second = 0;

        // Iterate from both ends of the string towards the center.
        while (start < end) {
            // Check if the character at the 'start' index is a vowel, and if so, increment 'first'.
            if (isVowel(s.charAt(start)))
                first++;

            // Check if the character at the 'end' index is a vowel, and if so, increment 'second'.
            if (isVowel(s.charAt(end)))
                second++;

            // Move towards the center by adjusting the 'start' and 'end' indices.
            start++;
            end--;
        }

        // Return true if the counts of vowels in the two halves are equal; otherwise, return false.
        return first == second;
    }

    /**
     * Checks if a given character is a vowel (case-insensitive).
     * <p>
     * The method takes a character 'ch' as input and checks if it is a vowel
     * by comparing it with the known vowel characters (both uppercase and lowercase).
     *
     * @param ch The character to be checked.
     * @return True if the character is a vowel (case-insensitive); otherwise, false.
     */
    public static boolean isVowel(char ch) {
        // Convert the character to lowercase for case-insensitive comparison.
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel.
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
