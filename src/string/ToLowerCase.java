package string;

public class ToLowerCase {
    public static void main(String[] args) {
        String str = "LOVELY";

        System.out.println("Original String : " + str);

        System.out.println("After conversation : " + toLowerCase(str));
    }

    /**
     * Converts a given string to lowercase.
     * <p>
     * The method takes a string 's' as input and converts all uppercase characters in the string
     * to their corresponding lowercase forms, maintaining the rest of the characters unchanged.
     * The resulting string with all characters converted to lowercase is returned.
     *
     * @param s The input string to be converted to lowercase.
     * @return The input string with all characters converted to lowercase.
     */
    public static String toLowerCase(String s) {
        // Initialize a StringBuilder to store the result string.
        StringBuilder resultStr = new StringBuilder(s.length());

        // Iterate through each character in the input string 's'.
        for (char ch : s.toCharArray()) {
            // Get the ASCII value of the character.
            int asciiValue = (int) ch;

            // Check if the character is an uppercase letter (ASCII values 65 to 90).
            if (asciiValue >= 65 && asciiValue <= 90) {
                // Convert the uppercase letter to its corresponding lowercase form.
                // Add 32 to the ASCII value to get the lowercase character's ASCII value.
                asciiValue += 32;

                // Append the lowercase character to the result string.
                resultStr.append((char) asciiValue);
            } else {
                // If the character is not an uppercase letter, append it as is to the result string.
                resultStr.append(ch);
            }
        }

        // Convert the StringBuilder to a regular string and return the result.
        return resultStr.toString();

        // Alternative implementation using the built-in toLowerCase() method:
        // return s.toLowerCase();
    }

}
