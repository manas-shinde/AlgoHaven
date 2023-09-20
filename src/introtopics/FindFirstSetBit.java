package introtopics;

public class FindFirstSetBit {

    /**
     * Finds the position of the first set bit (1) in a binary representation of a number.
     *
     * @param n The input number.
     * @return The position of the first set bit, or 0 if no set bit is found.
     */
    public static int getFirstSetBit(int n) {
        int count = 0;

        if (n == 0) return 0; // If the input number is 0, there are no set bits.

        while (n > 0) {
            count++;
            if (n % 2 == 1) return count; // Return the position of the first set bit.
            else n = n / 2; // Right shift the number to check the next bit.
        }

        return 0; // If no set bit is found, return 0.
    }

    public static void main(String[] args) {
        int num = 18;
        int firstBitAt = getFirstSetBit(num);
        System.out.println("First set Bit on number : " + num + " at position :" + firstBitAt);

        // Edge Test Case
        int edgeCase = 0;
        int edgeResult = getFirstSetBit(edgeCase);
        System.out.println("First set Bit on number : " + edgeCase + " at position :" + edgeResult);
    }
}
