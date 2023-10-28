package linked_list;

import java.util.ArrayList;
import java.util.List;

public class SplitLinkedListParts {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Define the number of parts to split the list into
        int k = 3;

        // Create an instance of SplitLinkedListParts
        SplitLinkedListParts splitter = new SplitLinkedListParts();

        // Call the splitListToParts method
        ListNode[] result = splitter.splitListToParts(head, k);

        // Print the results
        System.out.println("Linked List Split into " + k + " Parts:");
        for (int i = 0; i < result.length; i++) {
            System.out.print("Part " + i + ": ");
            printList(result[i]);
        }
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
     * Split a linked list into k parts.
     *
     * @param head The head of the linked list to split.
     * @param k The number of parts to split the list into.
     * @return An array containing the heads of the split linked list parts.
     */
    public ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: Calculate the length of the linked list
        int length = 0;
        ListNode current = head;
        List<ListNode> parts = new ArrayList<>();

        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Calculate batch size and extra
        int baseSize = length / k;
        int extra = length % k;
        current = head;

        for (int i = 0; i < k; i++) {
            int partSize = baseSize + (extra > 0 ? 1 : 0);
            ListNode partHead = null, partTail = null;

            for (int j = 0; j < partSize; j++) {
                if (partHead == null) {
                    partHead = partTail = current;
                } else {
                    partTail.next = current;
                    partTail = partTail.next;
                }

                if (current != null) {
                    current = current.next;
                }
            }

            if (partTail != null) {
                partTail.next = null;
            }

            parts.add(partHead);
            extra = Math.max(extra - 1, 0);
        }

        return parts.toArray(new ListNode[0]);
    }
}
