package patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        * Simple Pattern Program :
        *    *
        *    **
        *    ***
        *    ****
        *    *****
        * */
        Scanner sc = new Scanner(System.in);
        int totalRows = sc.nextInt();

        for (int row = 1; row <= totalRows; row++) {
            for (int cst = 1; cst <= row; cst++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
