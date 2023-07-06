package functions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();

        String answer = isPrime(number) ? "prime" : "not a prime";

        System.out.println("Give number is " + answer + " number!");
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;

        if (number % 2 == 0 || number % 3 == 0) return true;

        for (int i = 5; i <= Math.sqrt(number); i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return false;
    }
}
