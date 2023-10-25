package linked_list;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Create an instance of RemoveLinkedListElements
        RemoveLinkedListElements remover = new RemoveLinkedListElements();

        // Define the value to remove (e.g., 6)
        int val = 6;

        // Call the removeElements method
        head = remover.removeElements(head, val);
        System.out.println("List after removing value " + val + ":");
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

    public ListNode removeElements(ListNode head, int val) {
        // Remove elements with the specified value from the linked list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
