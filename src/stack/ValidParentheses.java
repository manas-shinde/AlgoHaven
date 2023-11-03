package stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();

        // Test the isValid method with sample input.
        String input = "{[()]}";
        boolean isValid = validator.isValid(input);

        System.out.println("Input: " + input);
        System.out.println("Is Valid: " + isValid);
    }

    /**
     * Validates the input string containing parentheses.
     *
     * @param s The input string to validate.
     * @return True if the string contains valid parentheses, false otherwise.
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char element : s.toCharArray()) {
            if (element == '(') stack.push(')');
            else if (element == '[') stack.push(']');
            else if (element == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != element) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
