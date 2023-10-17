package linked_list;

public class ReorderList {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        display(head);

        // Create an instance of the class
        ReorderList reorderList = new ReorderList();

        // Call the reorderList method to reorder the list
        reorderList.reorderList(head);

        System.out.println("Reordered List:");
        display(head);
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Reorders a singly linked list such that the first part of the list is merged with the reversed second part.
     *
     * @param head The head of the linked list.
     */
    public void reorderList(ListNode head) {
        //Step - 1: slice the list into two parts
        ListNode slow = head;
        ListNode fast = head;

        // Move 'slow' to the middle of the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }

        // 'list1' is the first part of the list, 'list2' is the second part
        ListNode list1 = head;
        ListNode list2 = slow.next;
        slow.next = null;

        // Step - 2: Reverse the second part of the list
        list2 = reverseList(list2);

        //Step - 3: Merge the two parts alternately
        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode prev = new ListNode(-1);
        ListNode prevHead = prev;
        boolean dataFromList1 = true;

        while (l1 != null && l2 != null) {
            if (dataFromList1) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
            dataFromList1 = !dataFromList1; // Toggle between lists
        }
        // Append any remaining nodes
        prev.next = l1 != null ? l1 : l2;

        // Update the head of the linked list
        head = prevHead.next;
    }

    /**
     * Reverses a singly linked list and returns the new head.
     *
     * @param head The head of the linked list to reverse.
     * @return The new head of the reversed linked list.
     */
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return prev;
    }
}
