package functions;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        String eligibleOrNot = isEligibleToVote(age) ? "eligible" : "Not eligible";

        System.out.println("Your " + eligibleOrNot + " to vote!");

    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
