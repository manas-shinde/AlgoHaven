package patterns;

public class Pattern3 {
    public static void main(String[] args) {

        printAlphabets(7, false);
    }

    public static void printAlphabets(int totalRows, boolean isLowercase) {
        char ch = isLowercase ? 'a' : 'A';
        int totalChars = 1;

        for (int row = 1; row <= totalRows; row++) {
            //TODO: current Row
            for (int cst = 1; cst <= totalChars; cst++)
                System.out.print(ch);
            //TODO: Next Row
            System.out.println();
            if (row <= totalRows / 2) {
                totalChars++;
                ch++;
            } else {
                totalChars--;
                ch--;
            }
        }
    }

    public static void printPattern(int n, boolean isStars) {
        int stars = 1;
        for (int row = 1; row <= n; row++) {
            //TODO: Current Row
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print(isStars ? "*" : cst);
            }
            //TODO:next row
            System.out.println();
            if (row <= n / 2) stars++;
            else stars--;
        }
    }
}
