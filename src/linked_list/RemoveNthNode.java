package linked_list;

public class RemoveNthNode {
    /**
     * Removes the nth node from the end of a linked list.
     *
     * @param head The head of the linked list.
     * @param n    The position of the node to remove from the end (1-indexed).
     * @return The head of the modified linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //In this approach , need to iterate over linked list twice.

        // Create a dummy node to handle the case of removing the head.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int size = 0;
        ListNode curr = head;

        // Calculate the size of the linked list.
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        n = size - n;

        curr = dummy;
        // Traverse to the node just before the target node.
        for (int i = 0; i < n; i++) {
            curr = curr.next;
        }

        // Remove the target node.
        curr.next = curr.next.next;

        return dummy.next;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
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

        // Create an instance of RemoveNthNode
        RemoveNthNode remover = new RemoveNthNode();

        // Define the value of n (the position from the end to remove)
        int n = 2;

        // Call the removeNthFromEnd method
        head = remover.removeNthFromEnd1(head, n);

        // Print the modified list
        System.out.println("Modified List:");
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
}
