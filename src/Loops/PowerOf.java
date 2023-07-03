package Loops;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number :");
        int b = scanner.nextInt();

        System.out.println(a + "^" + b + " = " + calculatePower(a, b));
    }

    public static int calculatePower(int a, int b) {
        int power = a;
        for (int i = 1; i < b; i++) {
            power *= a;
        }
        return power;
    }
}
