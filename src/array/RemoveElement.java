package array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

        int ans = removeElement(arr, 2);

        System.out.println("Answer is :" + ans);
        ArrayMethods.display(arr);
    }

    public static int removeElement(int[] arr, int val) {
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != val) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }

        return index;

    }

    public static int removeElement1(int[] arr, int val) {
        int j = arr.length - 1;
        int i = 0;
        while (j > i) {
            if (arr[j] == val) j--;
            if (arr[i] == val) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
        return j;
    }
}
