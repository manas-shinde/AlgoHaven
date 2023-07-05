package patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = scanner.nextInt();


        for (int row = n; row >= 0; row--) {
            for (int cst = 1; cst <= row; cst++)
                System.out.print("*");
            System.out.println();
        }
    }
}
