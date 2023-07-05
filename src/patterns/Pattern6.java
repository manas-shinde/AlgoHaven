package patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input :");
        int totalRows = sc.nextInt();

        int stars = 1, spaces = totalRows - 2;

        for (int row = 1; row <= totalRows; row++) {
            //TODO:Work for Current Row
            //stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            //spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            //stars
            int currentStars = stars;
            if (row == totalRows / 2 + 1) {//taking care of edge case because on this line will have one extra star
                currentStars = stars - 1;
            }
            for (int cst = 1; cst <= currentStars; cst++) {
                System.out.print("*");
            }
            //TODO:prep for Next Row
            System.out.println();
            if (row <= totalRows / 2) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
        }
    }
}
