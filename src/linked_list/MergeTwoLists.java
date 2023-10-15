package linked_list;

/**
 * This class demonstrates how to merge two sorted linked lists.
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Create an instance of MergeTwoLists
        MergeTwoLists listMerger = new MergeTwoLists();

        // Merge the two lists
        ListNode mergedList = listMerger.mergeTwoLists(list1, list2);

        // Display the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");

        // Edge Cases:
        // Case 1: When one list is null
        ListNode edgeList1 = new ListNode(1);
        edgeList1.next = new ListNode(3);

        ListNode edgeList2 = null;

        System.out.println("Edge Case 1: Merging with one list as null.");
        ListNode mergedEdgeList1 = listMerger.mergeTwoLists(edgeList1, edgeList2);
        while (mergedEdgeList1 != null) {
            System.out.print(mergedEdgeList1.val + " -> ");
            mergedEdgeList1 = mergedEdgeList1.next;
        }
        System.out.println("null");

        // Case 2: When both lists are null
        ListNode edgeList3 = null;
        ListNode edgeList4 = null;

        System.out.println("Edge Case 2: Merging with both lists as null.");
        ListNode mergedEdgeList2 = listMerger.mergeTwoLists(edgeList3, edgeList4);
        if (mergedEdgeList2 == null) {
            System.out.println("Both lists are null.");
        }
    }

    /**
     * Merges two sorted linked lists.
     *
     * @param list1 The head of the first sorted linked list.
     * @param list2 The head of the second sorted linked list.
     * @return The head of the merged sorted linked list.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Handle edge cases where one or both lists are null
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode prevHead = new ListNode(-1, null);
        ListNode prev = prevHead;

        // Traverse both lists, comparing and merging nodes
        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                prev.next = list2;
                list2 = list2.next;
            } else {
                prev.next = list1;
                list1 = list1.next;
            }
            prev = prev.next;
        }

        // Handle remaining nodes in either list
        prev.next = (list1 == null) ? list2 : list1;

        return prevHead.next;
    }
}
