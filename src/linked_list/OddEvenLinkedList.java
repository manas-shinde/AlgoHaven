package linked_list;

public class OddEvenLinkedList {
    /**
     * Rearranges the given linked list to separate the odd and even positioned nodes.
     * This algorithm works in-place and maintains the relative order of odd and even nodes.
     *
     * @param head The head of the linked list.
     * @return The head of the rearranged linked list.
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create an instance of OddEvenLinkedList
        OddEvenLinkedList listDivider = new OddEvenLinkedList();

        // Call the oddEvenList method
        ListNode rearrangedHead = listDivider.oddEvenList(head);

        // Print the rearranged list
        while (rearrangedHead != null) {
            System.out.print(rearrangedHead.val);
            rearrangedHead = rearrangedHead.next;
            if (rearrangedHead != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
