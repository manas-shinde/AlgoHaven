package searching;

public class ValidMountainArray {

    /**
     * Checks if the given array is a valid mountain array.
     *
     * @param arr The array to check.
     * @return True if it's a valid mountain array, false otherwise.
     */
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        if (arr[0] >= arr[1]) return false; // The mountain should start with an increasing sequence.

        boolean inIncreasingPart = true;

        for (int i = 1; i < arr.length; i++) {
            if (inIncreasingPart) {
                if (arr[i - 1] < arr[i]) {
                    continue; // Still in the increasing part.
                } else if (arr[i - 1] == arr[i]) {
                    return false; // Plateau is not allowed.
                } else if (arr[i - 1] > arr[i]) {
                    inIncreasingPart = false; // Transition from increasing to decreasing.
                }
            } else {
                if (arr[i - 1] > arr[i]) {
                    continue; // Still in the decreasing part.
                } else {
                    return false; // Increasing sequence found in decreasing part or plateau.
                }
            }
        }

        return !inIncreasingPart; // Should end in the decreasing part.
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 3, 2, 1};
        boolean isValidMountainArray = validMountainArray(arr);
        System.out.println("Given is a mountain array? " + isValidMountainArray);

        // Additional test cases
        int[] validMountain = new int[]{1, 3, 5, 4, 2};
        boolean isValid = validMountainArray(validMountain);
        System.out.println("Is valid mountain array? " + isValid);

        int[] invalidMountain = new int[]{1, 2, 3, 4, 5};
        boolean isInvalid = validMountainArray(invalidMountain);
        System.out.println("Is valid mountain array? " + isInvalid);

        int[] singleElement = new int[]{1};
        boolean isSingleElementValid = validMountainArray(singleElement);
        System.out.println("Is valid mountain array for single element array? " + isSingleElementValid);
    }
}
