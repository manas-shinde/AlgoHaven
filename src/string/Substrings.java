package string;

import java.util.ArrayList;

public class Substrings {
    public static void main(String[] args) {
        String str = new String("manas");

        ArrayList<String> arr = generateSubstrings(str);

        System.out.println(arr);

    }

    /**
     * Generates all possible substrings of a given string.
     *
     * @param str The string from which substrings need to be generated.
     * @return An ArrayList containing all possible substrings of the input string.
     */
    public static ArrayList<String> generateSubstrings(String str) {
        ArrayList<String> arr = new ArrayList<>();
        int start = 0, end = start + 1;

        while (start < str.length()) {
            while (end <= str.length()) {
                arr.add(str.substring(start, end)); // Add the substring from start to end to the ArrayList
                end++;
            }
            start++;
            end = start + 1;
        }
        return arr;
    }

}
