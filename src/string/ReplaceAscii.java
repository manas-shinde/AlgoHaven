package string;

public class ReplaceAscii {
    public static void main(String[] args) {
        String str = new String("cdefg");

        String ans = replaceCharacters(str);
        System.out.println(ans);

    }

    /**
     * Replaces characters in a given string based on their ASCII values.
     * Characters at even indices are replaced with the next ASCII character,
     * while characters at odd indices are replaced with the previous ASCII character.
     *
     * @param str The string in which characters need to be replaced.
     * @return The modified string with replaced characters.
     */
    public static String replaceCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        int asciiValue;
        for (int index = 0; index < str.length(); index++) {
            asciiValue = (int) str.charAt(index);
            if (index % 2 == 0) {
                asciiValue++; // Replace character with next ASCII character
            } else {
                asciiValue--; // Replace character with previous ASCII character
            }
            sb.append((char) asciiValue); // Append the modified character to the StringBuilder
        }
        return sb.toString(); // Convert the StringBuilder to a String and return
    }

}
