package loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = scanner.nextInt();

        int a = 0, b = 1, c;

        System.out.print(a + " " + b + ' ');

        while (n != 0) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;


            n--;
        }
    }
}
