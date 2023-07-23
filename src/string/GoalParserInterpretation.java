package string;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        // Test the interpret() method with some example inputs.
        String input1 = "G()(al)";
        String input2 = "G()()()()(al)";

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + interpret(input1));

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + interpret(input2));
    }

    /**
     * Interprets a given command and returns the result string based on certain rules.
     * The method interprets a command string and performs the following replacements:
     * - Replace all occurrences of "G" with "G".
     * - Replace "(al)" with "al".
     * - Replace "()" with "o".
     *
     * @param command The input command string to be interpreted.
     * @return The interpreted string based on the replacement rules.
     */
    public static String interpret(String command) {
        // Initialize a StringBuilder to store the result string.
        StringBuilder resultStr = new StringBuilder(command.length());

        // Iterate through each character in the command string.
        for (int i = 0; i < command.length(); i++) {
            // Check if the character is 'G'.
            if (command.charAt(i) == 'G') {
                // Append 'G' to the result string as it is.
                resultStr.append('G');
            } else if (command.charAt(i) == '(') {
                // If the character is '(', check the next character to detect patterns.

                // Check if the next character is ')'.
                if (command.charAt(i + 1) == ')') {
                    // If it is, append 'o' to the result string and move the index 'i' forward.
                    resultStr.append('o');
                    i++; // Increment 'i' to skip the next character ')' as it has already been processed.
                } else {
                    // If it is not, append "al" to the result string.
                    resultStr.append("al");
                }
            }
        }

        // Convert the StringBuilder to a regular string and return the result.
        return resultStr.toString();

        // Alternative implementation using chained replace() method calls:
        // return command.replace("(al)", "al").replace("()", "o");
    }
}
/*
 * Comments:
 * 1. The method processes the input command character by character and constructs a new result string.
 * 2. When the character is 'G', it is copied as is to the result string.
 * 3. When the character is '(', the method checks the next character to determine the replacement pattern:
 *    - If the next character is ')', it means "(al)" is found, so 'o' is appended to the result string.
 *    - If the next character is not ')', it means a standalone '(', so "al" is appended to the result string.
 * 4. The alternative implementation using the replace() method is commented out and is functionally equivalent
 *    to the main loop's logic. However, the main loop approach is more efficient since it processes the input
 *    string only once and avoids unnecessary intermediate string creations.
 */