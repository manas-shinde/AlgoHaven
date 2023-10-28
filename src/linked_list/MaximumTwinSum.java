package linked_list;

import java.util.HashMap;

public class MaximumTwinSum {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        // Create an instance of MaximumTwinSum
        MaximumTwinSum twinSumCalculator = new MaximumTwinSum();

        // Call the pairSum method
        int result = twinSumCalculator.pairSum1(head);

        // Print the maximum twin sum
        System.out.println("Maximum Twin Sum: " + result);
    }

    /**
     * Find the middle point of the linked list.
     *
     * @param head The head of the linked list.
     * @return The middle node of the linked list.
     */
    public ListNode midPoint(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && slow != null) {
            if (fast.next.next != null)
                slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Calculate the maximum twin sum of the linked list.
     *
     * @param head The head of the linked list.
     * @return The maximum twin sum of the linked list.
     */
    public int pairSum1(ListNode head) {
        ListNode l1 = head;
        ListNode mid = midPoint(head);
        ListNode l2 = mid.next;
        mid.next = null;

        l2 = reverseList(l2);

        int result = Integer.MIN_VALUE;
        while (l1 != null && l2 != null) {
            result = Math.max(l1.val + l2.val, result);

            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }

    /**
     * Reverse a linked list using a recursive approach.
     *
     * @param head The head of the linked list.
     * @return The head of the reversed linked list.
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

    /**
     * Calculate the maximum twin sum of a linked list.
     * Brute Force Approach
     * TC - O(n)
     * SC - O(n)
     *
     * @param head The head of the linked list.
     * @return The maximum twin sum of the linked list.
     */
    public int pairSum(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode curr = head;
        int i = 0;
        int n = 0;

        // Step 1: Populate the map with linked list nodes and count the number of nodes
        while (curr != null) {
            map.put(i++, curr);
            curr = curr.next;
            n++;
        }

        int max = 0;

        // Step 2: Calculate the maximum twin sum
        for (int j = 0; j < n / 2; j++) {
            ListNode first = map.get(j);
            ListNode second = map.get(n - j - 1); // Subtract 1 for 0-based indexing
            int twinsSum = first.val + second.val;

            if (max < twinsSum) {
                max = twinsSum;
            }
        }

        return max;
    }
}
