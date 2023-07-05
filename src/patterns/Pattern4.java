package patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int totalRows = 7, stars = 1, spaces = totalRows / 2;

        for (int row = 1; row <= totalRows; row++) {
            //TODO:Current ROW
            //spaces
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            //stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            //TODO:NEXT ROW
            System.out.println();
            if (row <= totalRows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}
