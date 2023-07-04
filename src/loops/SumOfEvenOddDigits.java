package loops;

import java.util.Scanner;

public class SumOfEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = scanner.nextInt();

        int sumOfEven = 0, sumOfOdd = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) sumOfEven += digit;
            else if (digit % 3 == 0 || digit == 1) sumOfOdd += digit;

            n = n / 10;
        }
        System.out.println("Sum of ODD Number is : " + sumOfOdd);
        System.out.println("Sum of EVEN Number is : " + sumOfEven);

    }
}
