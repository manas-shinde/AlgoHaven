package string;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(s, indices));
    }

    /**
     * Restores a shuffled string by placing its characters at the correct positions
     * based on the provided indices array.
     *
     * @param s       The shuffled string to be restored.
     * @param indices An array containing the original positions of each character in the shuffled string.
     * @return The restored string.
     */
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);

        // Iterate through each index in the provided indices array.
        for (int i = 0; i < indices.length; i++) {
            // Set the character at the current index to its original position in the shuffled string.
            sb.setCharAt(indices[i], s.charAt(i));
        }

        // Convert the StringBuilder to a string and return the restored string.
        return sb.toString();
    }

}
