package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 1;

        System.out.println("Enter Number :");
        int totalRows = scanner.nextInt();

        for (int row = 1; row <= totalRows; row++) {
            //TODO: current Row
                //spaces
                for (int space = 1; space <= totalRows - row; space++) {
                    System.out.print(" ");
                }
                //stars
                for (int cst = 1; cst <= stars; cst++) {
                    System.out.print("*");
                }
            //TODO: Next row
            System.out.println();
            stars += 2;

        }
    }
}
