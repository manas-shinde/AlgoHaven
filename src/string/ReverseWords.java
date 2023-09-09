package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is blue";

        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        s = s.trim();

        List<String> result = Arrays.asList(s.split("\\s+"));

        Collections.reverse(result);

        return String.join(" ", result);
    }
}
