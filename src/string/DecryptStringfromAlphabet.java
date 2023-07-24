package string;


public class DecryptStringfromAlphabet {
    public static void main(String[] args) {
        String str = "1326#";

        System.out.println("Original String : " + str);

        System.out.println("Decrypted String : " + freqAlphabets1(str));
    }

    /**
     * Converts a string encoded with numbers and '#' back to its original alphabetic representation.
     * <p>
     * The function takes an encoded string containing characters from '1' to '26' representing alphabets 'a' to 'z'
     * and '#' representing double-digit alphabets ('10' to '26'). It decodes the string back to its original alphabetic
     * representation and returns the decoded string.
     *
     * @param s The encoded string to be decoded.
     * @return The decoded string in its original alphabetic representation.
     */
    public static String freqAlphabets1(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int end = s.length() - 1;

        while (end >= 0) {
            if (s.charAt(end) != '#') {
                // Handle regular characters (single-digit alphabets).
                int number = Character.getNumericValue(s.charAt(end));
                sb.insert(0, (char) (number + 96)); // Convert the number to a lowercase alphabet and insert it at the beginning.
                end--;
            } else {
                // Handle characters followed by '#'.
                char char1 = s.charAt(--end);
                char char2 = s.charAt(--end);

                int digit1 = char2 - '0'; // Convert the first character to an integer.
                int digit2 = char1 - '0'; // Convert the second character to an integer.

                int number = digit1 * 10 + digit2;
                sb.insert(0, (char) (number + 96)); // Convert the number to a lowercase alphabet and insert it at the beginning.
                end--;
            }
        }

        return sb.toString();
    }

    private static String freqAlphabets2(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            if (s.charAt(end) == '#') {
                // Handle the case when '#' is encountered.
                int digit1 = s.charAt(end - 1) - '0';
                int digit2 = s.charAt(end - 2) - '0';
                int number = digit1 * 10 + digit2;
                sb.append((char) (number + 96));
                end -= 3;
            } else {
                // Handle regular characters (a-z).
                int number = s.charAt(end) - '0';
                sb.append((char) (number + 96));
                end--;
            }
        }

        return sb.reverse().toString();

    }


}
