package patterns;


public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int totalRows = n * 2 - 1;

        int spaces = n - 1, totalDigits = 1, digit;
        for (int row = 1; row <= totalRows; row++) {

            //TODO:Current Row
            //spaces
            for (int csp = 1; csp <= spaces; csp++)
                System.out.print(" ");

            digit = (row <= totalRows / 2) ? row : totalRows - row + 1;

            //totalDigits
            for (int cd = 1; cd <= totalDigits; cd++) {
                int middleDigit = totalDigits / 2 + 1;

                System.out.print(digit);

                digit = cd < middleDigit ? digit - 1 : digit + 1;

            }
            //TODO:Next Row
            System.out.println();
            if (row <= totalRows / 2) {
                spaces--;
                totalDigits += 2;
            } else {
                totalDigits -= 2;
                spaces++;
            }
        }
    }
}
