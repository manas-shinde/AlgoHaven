package introtopics;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angles of triangle to check it's valid or not:");

        System.out.println("Angle 1 :");
        int angle1 = scanner.nextInt();

        System.out.println("Angle 2 :");
        int angle2 = scanner.nextInt();

        System.out.println("Angle 3 :");
        int angle3 = scanner.nextInt();

        if (isEveryAngleValid(angle1, angle2, angle3) && isSum180(angle1, angle2, angle3) && isValidTriangle(angle1, angle2, angle3)) {
            System.out.println("Triangle is Valid!!");
        } else {
            System.out.println("Triangle is invalid!!");
        }
    }

    public static boolean isEveryAngleValid(int angle1, int angle2, int angle3) {
        /*
         * Checks if every angle of a triangle is valid (greater than 0).
         *
         * @param angle1 The first angle of the triangle.
         * @param angle2 The second angle of the triangle.
         * @param angle3 The third angle of the triangle.
         * @return True if every angle is valid, false otherwise.
         */
        return (angle1 > 0 && angle2 > 0 && angle3 > 0);
    }

    public static boolean isSum180(int angle1, int angle2, int angle3) {
        /*
         * Checks if the sum of the angles of a triangle is equal to 180 degrees.
         *
         * @param angle1 The first angle of the triangle.
         * @param angle2 The second angle of the triangle.
         * @param angle3 The third angle of the triangle.
         * @return True if the sum is 180 degrees, false otherwise.
         */
        int totalSum = angle1 + angle2 + angle3;
        return totalSum == 180;
    }

    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        /*
         * Checks if the given angles form a valid triangle.
         *
         * @param angle1 The first angle of the triangle.
         * @param angle2 The second angle of the triangle.
         * @param angle3 The third angle of the triangle.
         * @return True if the angles form a valid triangle, false otherwise.
         */
        return (angle1 + angle2 <= angle3 || angle1 + angle3 <= angle2 || angle2 + angle3 <= angle1);
    }
}
