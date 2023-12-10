package recursion;

/**
 * Problem statement :
 * Take a input N, a number.
 * Print the odd numbers in decreasing sequence(up until 0) and even number in increasing sequence(up until N).
 * Eg. N = 6
 * print 5 3 1 2 4
 */
public class PrintOddEven {
    public static void f(int n) {
        if (n == 0) return;
        if ((n ^ 1) != (n + 1)) {
            System.out.println(n);
        }
        f(n - 1);
        if ((n ^ 1) == (n + 1)) System.out.println(n);

    }

    public static void printOddEven(int n) {
        /*
         * for readability and maintainability, you might want to use more straightforward approaches.
         * Also, the time complexity of the XOR operation might be slightly higher than direct modulo operations.
         */
        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
        if (n > 0) {
            printOddEven(n - 1);
        }
        if (n % 2 == 0 && n > 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int N = 6;
        f(N);
    }
}
