package string;

public class DefangIPAddr {
    public static void main(String[] args) {
        String address = "255.100.50.0";

        System.out.println(defangIPaddr(address));
    }

    /**
     * Replaces all occurrences of periods (dots) in the given IP address with "[.]".
     *
     * @param address The IP address as a string with dot-separated segments.
     * @return The IP address with periods replaced by "[.]".
     */
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        // Iterate through each character in the IP address.
        for (char ch : address.toCharArray()) {
            // If the character is a period, replace it with "[.]", otherwise, append the character as it is.
            sb.append(ch == '.' ? "[.]" : ch);
        }

        // Convert the StringBuilder to a string and return the modified IP address.
        return sb.toString();

        // Alternative solution using the string method:
        // return str.replaceAll("\\.", "[.]");
    }

}
