package patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input Number :");
        int totalRows = scanner.nextInt();

        for (int row = 0; row < totalRows; row++) {
            System.out.println((int) Math.pow(11, row));
        }
    }
}
