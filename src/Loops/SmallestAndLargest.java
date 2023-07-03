package Loops;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallestNumber = Integer.MAX_VALUE, largestNumber = Integer.MIN_VALUE;

        System.out.println("Enter Number :");
        int number = sc.nextInt();

        while (number != 0) {
            int digit = number % 10;

            if (digit > largestNumber) largestNumber = digit;
            else if (digit < smallestNumber) smallestNumber = digit;

            number /= 10;
        }
        System.out.println("Smallest Digit in Number " + number + " is " + smallestNumber);
        System.out.println("Largest Digit in Number " + number + " is " + largestNumber);

    }
}
