package linked_list;

public class RotateList {
    /**
     * Rotate a given linked list to the right by k places.
     *
     * @param head The head of the linked list.
     * @param k    The number of places to rotate the list to the right.
     * @return The head of the rotated linked list.
     */
    public ListNode rotateRight(ListNode head, int k) {
        //Brute Force approach
        if (head.next == null) return head;

        ListNode latestHead = head;

        while (k > 0) {
            ListNode snode = secondLastNode(latestHead);
            ListNode lnode = snode.next;

            lnode.next = latestHead;
            snode.next = null;
            latestHead = lnode;
            k--;
        }

        return latestHead;
    }

    /**
     * Rotate a given linked list to the right by k places (Optimized approach).
     *
     * @param head The head of the linked list.
     * @param k    The number of places to rotate the list to the right.
     * @return The head of the rotated linked list.
     */
    public ListNode rotateRight1(ListNode head, int k) {
        //Step 1: calculate size of Linked List
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (size == 0) return head;

        k = k % size;
        if (size == 0 || k == 0 || size == 1 || k == size) return head;

        // Step  2: Breaking Linked List at n - k
        int n = size - k - 1;
        curr = head;
        while (n > 0) {
            curr = curr.next;
            n--;
        }

        //Step 3 : Joining the two Linked Lists
        ListNode j = curr.next;
        ListNode o = curr.next;
        curr.next = null;
        k--;

        while (k > 0 && j.next != null) {
            j = j.next;
            k--;
        }
        j.next = head;
        return o;
    }

    /**
     * Find the second last node in the linked list.
     *
     * @param head The head of the linked list.
     * @return The second last node.
     */
    public static ListNode secondLastNode(ListNode head) {
        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // Print the original and rotated lists
        System.out.println("Original List:");
        printList(head);

        // Create an instance of RotateList
        RotateList rotator = new RotateList();

        // Define the value of k
        int k = 2;

        // Call the rotateRight method
        ListNode rotatedHead = rotator.rotateRight(head, k);
        System.out.println("Rotated List (Brute Force):");
        printList(rotatedHead);

        // Call the rotateRight1 method (Optimized)
        rotatedHead = rotator.rotateRight1(head, k);
        System.out.println("Rotated List (Optimized):");
        printList(rotatedHead);
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
