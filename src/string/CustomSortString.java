package string;

public class CustomSortString {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";

        System.out.println(customSortString(order, s));
    }

    /**
     * Sorts a given string `s` based on a custom order `order`.
     *
     * @param order The custom order string used for sorting.
     * @param s     The input string to be sorted.
     * @return The sorted string based on the custom order.
     */
    public static String customSortString(String order, String s) {
        int[] freq = new int[26]; // Array to store the frequency of each character
        StringBuilder result = new StringBuilder(); // Variable to store the sorted string

        // Count the frequency of each character in the input string
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Append characters from the custom order to the result string
        for (int i = 0; i < order.length(); i++) {
            while (freq[order.charAt(i) - 'a'] > 0) {
                freq[order.charAt(i) - 'a']--;
                result.append(order.charAt(i));
            }
        }

        // Append remaining characters (not present in the custom order) to the result string
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                result.append((char) (i + 'a'));
                freq[i]--;
            }
        }
        return result.toString();
    }
}