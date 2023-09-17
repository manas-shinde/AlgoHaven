package searching;

public class TernarySearchImpl {

    /**
     * Searches for an element in a sorted array using ternary search.
     * (Ternary Search is not optimize/higher complexity as compare with binary search)
     *
     * @param arr     The sorted array to search in.
     * @param element The element to search for.
     * @return The index of the element if found, or -1 if not found.
     */
    public static int ternarySearch(int[] arr, int element) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid1 = start + (end - start) / 3; // Calculate the first one-third point.
            int mid2 = end - (end - start) / 3;   // Calculate the two-thirds point.

            if (element == arr[mid1]) return mid1;
            else if (element == arr[mid2]) return mid2;

            if (element < arr[mid1]) end = mid1 - 1;
            else if (element > arr[mid2]) start = mid2 + 1;
            else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8, 9};
        int element = 6;
        int idx = ternarySearch(arr, element);
        System.out.println("Element " + element + " is present at index: " + idx);

        // Test cases
        int[] emptyArr = new int[]{};
        int emptyElement = 5;
        int emptyIdx = ternarySearch(emptyArr, emptyElement);
        System.out.println("Element " + emptyElement + " is present in Empty Array? Index: " + emptyIdx);

        int[] singleElementArr = new int[]{8};
        int singleElement = 8;
        int singleIdx = ternarySearch(singleElementArr, singleElement);
        System.out.println("Element " + singleElement + " is present in Single Element Array? Index: " + singleIdx);

        int[] notFoundArr = new int[]{1, 2, 3, 4, 5};
        int notFoundElement = 6;
        int notFoundIdx = ternarySearch(notFoundArr, notFoundElement);
        System.out.println("Element " + notFoundElement + " is present in Array? Index: " + notFoundIdx);
    }
}
