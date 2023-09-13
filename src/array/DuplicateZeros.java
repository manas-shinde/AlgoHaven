package array;

public class DuplicateZeros {
    public static void main(String[] args) {
        // Test case 1: Duplicate zeros in the middle of the array
        DuplicateZeros duplicator1 = new DuplicateZeros();
        int[] arr1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicator1.duplicateZeros(arr1);
        System.out.print("Test case 1: ");
        ArrayMethods.display(arr1);
        // Expected output: 1 0 0 2 3 0 0 4

        System.out.println(); // Separate test cases

        // Test case 2: Duplicate zeros at the end of the array
        DuplicateZeros duplicator2 = new DuplicateZeros();
        int[] arr2 = new int[]{1, 2, 3, 4, 0};
        duplicator2.duplicateZeros(arr2);
        System.out.print("Test case 2: ");
        ArrayMethods.display(arr2);
        // Expected output: 1 2 3 4 0 0

        System.out.println(); // Separate test cases

        // Test case 3: No zeros in the array
        DuplicateZeros duplicator3 = new DuplicateZeros();
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        duplicator3.duplicateZeros(arr3);
        System.out.print("Test case 3: ");
        ArrayMethods.display(arr3);
        // Expected output: 1 2 3 4 5

        System.out.println(); // Separate test cases

        // Test case 4: Only zeros in the array
        DuplicateZeros duplicator4 = new DuplicateZeros();
        int[] arr4 = new int[]{0, 0, 0, 0};
        duplicator4.duplicateZeros(arr4);
        System.out.print("Test case 4: ");
        ArrayMethods.display(arr4);
        // Expected output: 0 0 0 0 0 0 0 0

        System.out.println(); // Separate test cases

        // Test case 5: Empty array
        DuplicateZeros duplicator5 = new DuplicateZeros();
        int[] arr5 = new int[]{};
        duplicator5.duplicateZeros(arr5);
        System.out.print("Test case 5: ");
        ArrayMethods.display(arr5);
        // Expected output: (Empty array, nothing to duplicate)

        System.out.println(); // Separate test cases
    }

    /**
     * Duplicate each zero found in the array, shifting the rest of the elements to the right.
     *
     * @param arr The input array.
     */
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;         // Count of zeros to be duplicated.
        int length_ = arr.length - 1; // Length of the array.

        // First, count the number of zeros to be duplicated.
        for (int left = 0; left <= length_ - possibleDups; left++) {
            if (arr[left] == 0) {
                // If the current element is zero and it's at the last position where a
                // duplication can occur, just set the last element to zero and exit the loop.
                if (left == length_ - possibleDups) {
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length_ - possibleDups; // Index of the last element without duplication.

        // Duplicate zeros by shifting elements to the right.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0; // Duplicate zero.
                possibleDups--;
                arr[i + possibleDups] = 0; // Set the next element to zero.
            } else {
                arr[i + possibleDups] = arr[i]; // Shift non-zero elements.
            }
        }
    }

}
