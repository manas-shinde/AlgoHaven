package string;

public class SortSentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";

        System.out.println(str);

        System.out.println(sortSentence(str));
    }

    /**
     * Sorts the words in a sentence based on the numbers at the end of each word.
     * <p>
     * The method takes a sentence as input, where each word in the sentence ends with a number.
     * It sorts the words in the sentence based on these numbers and returns the sorted sentence.
     * The numbers at the end of each word represent the desired position of the word in the sorted sentence.
     * The sorting is done in ascending order of the numbers.
     *
     * @param s The input sentence containing words ending with numbers (e.g., "word1 word2 word3").
     * @return The sorted sentence based on the numbers at the end of each word.
     */
    public static String sortSentence(String s) {
        // Split the sentence into individual words by using a space (" ") as the delimiter.
        String[] str = s.split(" ");

        // Create an array to store the sorted words.
        String[] res = new String[str.length];

        // Create a StringBuilder to build the sorted sentence.
        StringBuilder sb = new StringBuilder();

        int i = 0;

        // Iterate through each word in the sentence.
        for (String st : str) {
            // Extract the number at the end of the word (represented by the last character).
            // Convert the character to an integer and subtract '0' to get the actual numeric value.
            i = (int) (st.charAt(st.length() - 1) - '0');

            // Place the word at the correct position in the 'res' array based on the number.
            // Since the numbers are 1-indexed and array indices are 0-indexed, we subtract 1 from the number.
            res[i - 1] = st.substring(0, st.length() - 1);
        }

        // Build the sorted sentence by appending words from the 'res' array.
        for (i = 0; i < res.length - 1; i++) {
            sb.append(res[i]).append(" ");
        }
        sb.append(res[i]);

        // Convert the StringBuilder to a regular string and return the sorted sentence.
        return sb.toString();
    }

}
