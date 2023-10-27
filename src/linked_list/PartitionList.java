package linked_list;

public class PartitionList {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Create an instance of PartitionList
        PartitionList partitioner = new PartitionList();

        // Define the value of x
        int x = 3;

        // Call the partition method
        ListNode partitionedHead = partitioner.partition(head, x);
        System.out.println("Partitioned List:");
        printList(partitionedHead);
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
     * Partition a linked list into two parts: elements less than x and elements greater than or equal to x.
     *
     * @param head The head of the linked list to be partitioned.
     * @param x    The partition value.
     * @return The head of the partitioned linked list.
     */
    public ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(-1);
        ListNode afterHead = new ListNode(-1);
        ListNode before = beforeHead;
        ListNode after = afterHead;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                before.next = curr;
                before = before.next;
            } else {
                after.next = curr;
                after = after.next;
            }
            curr = curr.next;
        }
        before.next = afterHead.next;
        after.next = null;

        return beforeHead.next;
    }
}
