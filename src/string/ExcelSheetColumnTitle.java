package string;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int number = 701;
        System.out.println("Number : " + number + "Title : " + convertToTitle(number));
    }

    /**
     * Converts a given column number to its corresponding Excel column title.
     * <p>
     * This function takes an integer columnNumber as input and converts it into
     * an Excel column title representation. For example, column number 1 is represented
     * by 'A', column number 27 is represented by 'AA', and so on.
     * <p>
     * The function follows a base-26 numbering system where the characters 'A' to 'Z'
     * represent column numbers 1 to 26 respectively. When the columnNumber exceeds 26,
     * the function appends additional characters based on the number of multiples of 26
     * present in the columnNumber.
     *
     * @param columnNumber The integer representing the column number to convert.
     * @return The Excel column title as a string.
     * @throws IllegalArgumentException If the columnNumber is less than 1 (non-positive).
     **/
    public static String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();
        // Run a while loop while columnNumber is positive...
        while (columnNumber > 0) {
            // Subtract 1 from columnNumber...
            columnNumber--;
            // Get current character by doing modulo of columnNumber by 26...
            char c = (char) (columnNumber % 26 + 'A');
            // Divide columnNumber by 26...
            columnNumber /= 26;
            // Append the character into output...
            output.append(c);
        }
        // Reverse the output string...
        // Bcause we have found characters from right to left...
        output.reverse();
        // Return the reversed string.
        return output.toString();
    }
}
