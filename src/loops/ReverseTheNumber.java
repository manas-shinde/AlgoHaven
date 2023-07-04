package loops;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number :");
        int number = scanner.nextInt();

        System.out.println("Reverse Number :" + reverseNumber(number));

    }

    public static int reverseNumber(int number) {
        int answer = 0;
        while (number != 0) {
            int lastDigit = number % 10;

            answer = answer * 10 + lastDigit;
            number /= 10;

        }
        return answer;
    }
}
