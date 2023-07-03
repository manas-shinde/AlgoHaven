package Loops;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        int number1, number2;

        do {
            System.out.println("Enter First Number :");
            number1 = scanner.nextInt();

            System.out.println("Enter Second Number :");
            number2 = scanner.nextInt();

            System.out.println("Enter Choice :\n1.Sum (+)\n2.Difference(-)\n3.Product(*)\n4.quotient(/)\n5.Remainder(%)\n6.Exit(x/X)");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '+':
                    int sum = number1 + number2;
                    System.out.println("Sum of two number is " + sum);
                    break;
                case '-':
                    int diff = number1 - number2;
                    System.out.println("Difference of Two number is " + diff);
                    break;
                case '*':
                    int product = number1 * number2;
                    System.out.println("Product of two number is " + product);
                    break;
                case '/':
                    int quotient = number1 / number2;
                    System.out.println("Quotient is " + quotient);
                    break;
                case '%':
                    int remainder = number1 % number2;
                    System.out.println("Remainder is " + remainder);
                    break;
                default:
                    System.out.println("Please enter correct input!");
            }
        } while (choice != ('x'));
    }
}
