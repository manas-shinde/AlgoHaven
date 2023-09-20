package searching;

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 5, 6, 4};

        int peakElement = findPeakElement(arr);

        System.out.println("Peak element found at index : " + peakElement);

    }
}
