package linked_list;

public class NextGreaterNodeInLinkedList {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Create an instance of NextGreaterNodeInLinkedList
        NextGreaterNodeInLinkedList ng = new NextGreaterNodeInLinkedList();

        // Call the nextLargerNodes method
        int[] result = ng.nextLargerNodes(head);
        System.out.println("Next Greater Nodes in the List:");
        for (int num : result) {
            System.out.print(num + " ");
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
     * Calculate the next greater node for each node in a linked list.
     *
     * @param head The head of the linked list.
     * @return An array containing the next greater node for each node in the linked list.
     */
    public int[] nextLargerNodes(ListNode head) {

        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            n++;
        }

        int[] arr = new int[n];
        curr = head;
        ListNode itr = curr;
        int i = 0;

        while (curr != null) {
            int max = 0;
            while (itr != null) {
                if (curr.val < itr.val) {
                    max = itr.val;
                    break;
                }
                itr = itr.next;
            }
            if (max != curr.val) arr[i] = max;
            else arr[i] = 0;
            i++;
            curr = curr.next;
            itr = curr;
        }

        return arr;
    }
}
