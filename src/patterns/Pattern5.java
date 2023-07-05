package patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= 2 * n - 1; i++)
            System.out.print("*");

        System.out.println();
        int totalRows = n - 1;
        int stars = n - 1, spaces = 1;
        for (int row = 1; row <= totalRows; row++) {
            //TODO: current Row

            //stars
            for (int cst = 1; cst <= stars; cst++)
                System.out.print("*");

            //spaces
            for (int csp = 1; csp <= spaces; csp++)
                System.out.print(" ");

            //stars
            for (int cst = 1; cst <= stars; cst++)
                System.out.print("*");

            //TODO: NEXT ROW
            System.out.println();
            stars--;
            spaces += 2;
        }
    }
}
