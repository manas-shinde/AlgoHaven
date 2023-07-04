package introtopics;

import java.util.Scanner;

/**
 * LeetCode question link -> https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
 */
public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scanner.nextInt();
        int productOfDigits = 1, sumOfDigit = 0, digit;

        while (number != 0) {
            digit = number % 10;
            productOfDigits *= digit;
            sumOfDigit += digit;
            number /= 10;
        }

        System.out.println("Product of Digits :" + productOfDigits);
        System.out.println("Sum of Digits :" + sumOfDigit);
        System.out.println("Result :" + (productOfDigits - sumOfDigit));


    }
}
