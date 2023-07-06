package functions;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;


        System.out.println("Enter first Number :");
        firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number :");
        secondNumber = scanner.nextInt();

        System.out.println("Enter Third Number :");
        thirdNumber = scanner.nextInt();

        int largestNumber = largest(firstNumber, secondNumber, thirdNumber);
        System.out.println("Largest Number between above three numbers : " + largestNumber);

        int smallestNumber = smallest(firstNumber, secondNumber, thirdNumber);
        System.out.println("Smallest Number between above three numbers :" + smallestNumber);

    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) max = second;

        if (third > max) max = third;

        return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) min = second;

        if (third < min) min = third;

        return min;
    }

}
