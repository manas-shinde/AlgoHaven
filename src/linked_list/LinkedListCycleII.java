package linked_list;

public class LinkedListCycleII {
    /**
     * Detects and returns the node where a cycle begins in a linked list.
     *
     * @param head The head of the linked list.
     * @return The node where the cycle begins, or null if there's no cycle.
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle if there are less than 2 nodes.
        }

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Determine if there is a cycle and find the meeting point.
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Cycle detected, they meet at the same node.
            }
        }

        // Phase 2: Find the starting node of the cycle if it exists.
        if (slow != fast) {
            return null; // No cycle found.
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Starting node of the cycle.
    }

    public static void main(String[] args) {
        // Create a sample linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 2 (back to node 2)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head; // Create a cycle

        // Create an instance of LinkedListCycleII
        LinkedListCycleII cycleDetector = new LinkedListCycleII();

        // Call the detectCycle method to find the starting node of the cycle
        ListNode cycleStart = cycleDetector.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle detected. Starting node of the cycle: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
