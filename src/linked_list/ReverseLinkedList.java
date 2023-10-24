package linked_list;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Create an instance of ReverseLinkedList
        ReverseLinkedList reverser = new ReverseLinkedList();

        // Call the reverseList1 method
//        head = reverser.reverseList1(head);
//        System.out.println("Reversed List using recursive method:");
//        printList(head);

        // Call the reverseList2 method
        head = reverser.reverseList2(head);
        System.out.println("Reversed List using iterative method:");
        printList(head);
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public ListNode reverseList1(ListNode head) {
        // Reverse a linked list using a recursive approach
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = reverseList1(head.next);

        head.next.next = head;
        head.next = null;
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        // Reverse a linked list using a three-pointer iterative approach
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        return head;
    }
}
