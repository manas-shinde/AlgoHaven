package linked_list;

public class AddTwoNumbers {
    /**
     * Adds two numbers represented as linked lists.
     *
     * @param l1 The first number as a linked list.
     * @param l2 The second number as a linked list.
     * @return The result as a linked list.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a new linked list to store the result.
        ListNode prev = new ListNode(-1);
        ListNode prevhead = prev;

        int carry = 0;

        while (l1 != null && l2 != null) {
            // Calculate the sum of current digits plus the carry from the previous step.
            int sum = l1.val + l2.val + carry;
            carry = sum / 10; // Calculate the carry for the next step.
            prev.next = new ListNode(sum % 10); // Create a new node with the digit and add it to the result list.
            prev = prev.next;

            // Move to the next digits in both input lists.
            l1 = l1.next;
            l2 = l2.next;
        }

        // Process any remaining digits in l1.
        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            l1 = l1.next;
            prev = prev.next;
        }

        // Process any remaining digits in l2.
        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            l2 = l2.next;
            prev = prev.next;
        }

        // If there's a carry left, create an additional node for it.
        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        // Return the result linked list.
        return prevhead.next;
    }

    public static void main(String[] args) {
        // Test Case 1: 243 + 465 = 708
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(l1, l2);

        System.out.println("Test Case 1: 243 + 465 = 708");
        printLinkedList(l1);
        System.out.println(" + ");
        printLinkedList(l2);
        System.out.println(" = ");
        printLinkedList(result);
    }

    // Helper function to print the linked list.
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
