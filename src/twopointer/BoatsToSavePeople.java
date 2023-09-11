package twopointer;

import java.util.Arrays;

public class BoatsToSavePeople {
    /**
     * Calculate the minimum number of boats required to rescue people within a weight limit.
     * <p>
     * Given an array of people's weights and a weight limit per boat, this function calculates
     * the minimum number of boats needed to rescue all people while ensuring that people who
     * can share a boat are consecutive in the sorted array.
     *
     * @param people An array containing the weights of people.
     * @param limit  The weight limit per boat.
     * @return The minimum number of boats required to rescue all people.
     */
    public static int numRescueBoats(int[] people, int limit) {
        // Sort the array in ascending order by weight.
        Arrays.sort(people);

        int start = 0, end = people.length - 1;
        int totalBoats = 0;

        // Continue until the pointers meet or cross.
        while (start <= end) {
            totalBoats++; // At least one boat is needed.

            // If the sum of weights of the person at the start pointer and the person at the end
            // pointer is within the limit, they can share a boat. Move the start pointer to the right.
            if (people[start] + people[end] <= limit)
                start++;

            // In any case, move the end pointer to the left.
            end--;
        }
        return totalBoats;
    }

    public static void main(String[] args) {
        int[] peoplesWeight = new int[]{3, 5, 3, 4};
        int limit = 5;

        int totalBoats = numRescueBoats(peoplesWeight, limit);

        System.out.println("Total Boats required to rescue peoples: " + totalBoats);
    }
}
