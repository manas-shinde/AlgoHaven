package searching;

public class BinarySearchImpl {
    public static void main(String[] args) {
        // Test cases
        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8, 9};
        int element = 6;
        boolean isFound = binarySearch(arr, element);
        System.out.println("Element " + element + " is present in Array? : " + isFound);

        int[] emptyArr = new int[]{};
        int emptyElement = 5;
        boolean isEmptyFound = binarySearch(emptyArr, emptyElement);
        System.out.println("Element " + emptyElement + " is present in Empty Array? : " + isEmptyFound);

        int[] singleElementArr = new int[]{8};
        int singleElement = 8;
        boolean isSingleElementFound = binarySearch(singleElementArr, singleElement);
        System.out.println("Element " + singleElement + " is present in Single Element Array? : " + isSingleElementFound);

        int[] notFoundArr = new int[]{1, 2, 3, 4, 5};
        int notFoundElement = 6;
        boolean isNotFound = binarySearch(notFoundArr, notFoundElement);
        System.out.println("Element " + notFoundElement + " is present in Array? : " + isNotFound);
    }

    /**
     * Searches for an element in a sorted array using binary search.
     *
     * @param arr     The sorted array to search in.
     * @param element The element to search for.
     * @return True if the element is found in the array, false otherwise.
     */
    public static boolean binarySearch(int[] arr, int element) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index correctly.

            if (arr[mid] == element) {
                System.out.println("Element " + element + " is present at Index " + mid);
                return true;
            } else if (arr[mid] > element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
