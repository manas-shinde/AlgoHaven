package linked_list;

import java.util.Scanner;

public class DoublyLLClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        DoublyLL doublyLL = new DoublyLL();

        do {
            System.out.println("1. Insert New Node at the Beginning");
            System.out.println("2. Insert New Node at the End");
            System.out.println("3. Insert New Node at an Index");
            System.out.println("4. Delete Node at the Beginning");
            System.out.println("5. Delete Node at the End");
            System.out.println("6. Delete Node at an Index");
            System.out.println("7. Display Linked List");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value for the new node: ");
                    int val1 = scanner.nextInt();
                    doublyLL.insertFirst(val1);
                    break;
                case 2:
                    System.out.print("Enter the value for the new node: ");
                    int val2 = scanner.nextInt();
                    doublyLL.insertLast(val2);
                    break;
                case 3:
                    try {
                        System.out.print("Enter the value for the new node: ");
                        int val3 = scanner.nextInt();
                        System.out.print("Enter the index where you would like to insert: ");
                        int idx = scanner.nextInt();
                        doublyLL.insertAt(val3, idx);
                    } catch (NullPointerException e) {
                        System.out.println(e.toString());
                    }
                    break;
                case 4:
                    doublyLL.deleteFirst();
                    break;
                case 5:
                    doublyLL.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter the index of the node you want to delete: ");
                    int deleteIdx = scanner.nextInt();
                    doublyLL.deleteAt(deleteIdx);
                    break;
                case 7:
                    System.out.println("Current Doubly Linked List:");
                    System.out.println("--------------------------");
                    doublyLL.display();
                    System.out.println("--------------------------");
                    break;
                case 8:
                    System.out.println("Thanks!");
                    break;
                default:
                    System.out.println("Please select a valid option.");
            }
        } while (choice != 8);
    }
}
