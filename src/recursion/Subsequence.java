package recursion;

public class Subsequence {
    public static void main(String[] args) {
        f("abc", 0, "");
    }

    public static void f(String str, int idx, String output) {
        if (idx == str.length()) {
            System.out.println("[" + output + "]");
            return;
        }

        f(str, idx + 1, output + str.charAt(idx));
        f(str, idx + 1, output);
    }
}
