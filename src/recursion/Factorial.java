package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to finds its factorial : ");
        int n = sc.nextInt();

        System.out.println(n + "! = " + f(n));
    }

    public static int f(int n) {
        //base case
        if (n == 1) return 1;
        return n * f(n - 1);
    }
}
