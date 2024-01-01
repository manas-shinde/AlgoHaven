package recursion;

/*
Take as input M, a number.
Write a recursive function which returns an array containing indices of all items in the array which have value equal to M.
Print all the values in the returned array.
 */
public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 3, 5, 3};
        int target = 3;

        int[] result = findIndices(arr, 0, target, new int[arr.length], 0);

        for (int val : result) {
            System.out.println(val);
        }
    }

    public static int[] findIndices(int[] arr, int currentIdx, int target, int[] resultArr, int resultIdx) {
        //base case
        if (currentIdx >= arr.length) return resultArr;

        //self work
        if (arr[currentIdx] == target) {
            resultArr[resultIdx] = currentIdx;
            resultIdx++;
        }

        //assumptions
        return findIndices(arr, currentIdx + 1, target, resultArr, resultIdx);
    }
}
