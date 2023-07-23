package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {
        // Create a List<List<String>> with the given values.
        List<List<String>> values = new ArrayList<>();

        values.add(Arrays.asList("phone", "blue", "pixel"));
        values.add(Arrays.asList("computer", "silver", "phone"));
        values.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "type", ruleValue = "phone";

        System.out.println(countMatches(values, ruleKey, ruleValue));
    }

    /**
     * Counts the number of items that match the specified rule in a list of lists.
     * <p>
     * The method counts the occurrences of items that match the given ruleKey and ruleValue
     * in a list of lists containing items. The ruleKey can be "type", "color", or "name",
     * and the ruleValue is the value to be compared with the corresponding element in each item.
     *
     * @param items     The list of lists containing items to be searched.
     * @param ruleKey   The key to identify which element of the item to compare (e.g., "type", "color", or "name").
     * @param ruleValue The value to be compared with the element identified by ruleKey in each item.
     * @return The count of items that match the specified rule.
     */
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;

        // Iterate through each item in the list of lists.
        for (List<String> item : items) {
            // Compare the specified ruleKey and ruleValue with the corresponding elements of the item.
            // If the elements match, increment the count (cnt) by 1.
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                cnt++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                cnt++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                cnt++;
            }
        }

        // Return the final count of items that match the specified rule.
        return cnt;
    }

}
