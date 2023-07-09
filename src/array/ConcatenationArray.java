package array;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 1};

        System.out.println("Original Array :");

        ArrayMethods.display(arr);

        int[] arr1 = getConcatenation(arr);

        System.out.println("Concatenated Array :");
        ArrayMethods.display(arr1);
    }

    public static int[] getConcatenation(int[] arr) {
        int length = arr.length;
        int[] resultArr = new int[length * 2];

        for (int itr = 1; itr <= 2; itr++) {
            for (int i = 0; i < length; i++) {
                if (itr == 2) resultArr[i + length] = arr[i];
                resultArr[i] = arr[i];
            }
        }
        return resultArr;
    }
}
