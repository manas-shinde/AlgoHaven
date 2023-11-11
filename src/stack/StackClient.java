package stack;

import java.util.Scanner;

public class StackClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Stack<Integer> stack = new Stack<Integer>();


        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peak");
            System.out.println("4. isEmpty");
            System.out.println("5.Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value that you would like to insert into stack :");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int x = stack.pop();
                        System.out.println("Removed element was " + x + ".");
                    } else {
                        System.out.println("Stack is Empty!");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        int val = stack.peek();
                        System.out.println("Last value element is  " + val);
                    } else {
                        System.out.println("Stack is Empty!");
                    }
                    break;
                case 4:
                    System.out.println("Is stack Empty ? " + stack.isEmpty());
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("Thanks for using the application!");
                    break;
                default:
                    System.out.println("Please enter choose correct choise.");
            }
        } while (choice != 6);
    }
}
