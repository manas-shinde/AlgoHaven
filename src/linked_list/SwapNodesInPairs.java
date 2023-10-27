package linked_list;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Create an instance of SwapNodesInPairs
        SwapNodesInPairs swapper = new SwapNodesInPairs();

        // Call the swapPairs method
        ListNode swappedHead = swapper.swapPairs(head);
        System.out.println("List after Swapping Pairs:");
        printList(swappedHead);
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

    /**
     * Swap nodes in pairs in a linked list.
     *
     * @param head The head of the linked list.
     * @return The head of the linked list after swapping pairs of nodes.
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // Swap nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}
