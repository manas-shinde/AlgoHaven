package introtopics;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year to check its leap year or not :");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Leap Year!!");
        } else {
            System.out.println("Not Leap Year!!");
        }
    }

    public static boolean isLeapYear(int year) {
        /*
         * Checks if a given year is a leap year.
         *
         * @param year The year to be checked.
         * @return True if the year is a leap year, false otherwise.
         */
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
