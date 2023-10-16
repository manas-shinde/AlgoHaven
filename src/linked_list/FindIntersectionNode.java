package linked_list;

import java.util.HashMap;

public class FindIntersectionNode {
    public static void main(String[] args) {
        // Create two intersecting linked lists
        ListNode commonNode = new ListNode(8);
        commonNode.next = new ListNode(4);
        commonNode.next.next = new ListNode(5);

        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = commonNode;

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(0);
        listB.next.next = new ListNode(1);
        listB.next.next.next = commonNode;

        // Create an instance of FindIntersectionNode
        FindIntersectionNode intersectionFinder = new FindIntersectionNode();

        // Find the intersection node
        ListNode intersectionNode = intersectionFinder.getIntersectionNode3(listA, listB);

        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }

        // Edge Case: When there is no intersection
        ListNode noIntersectionListA = new ListNode(2);
        noIntersectionListA.next = new ListNode(6);
        noIntersectionListA.next.next = new ListNode(4);

        ListNode noIntersectionListB = new ListNode(1);
        noIntersectionListB.next = new ListNode(5);

        System.out.println("Edge Case: No intersection");
        ListNode noIntersectionNode = intersectionFinder.getIntersectionNode3(noIntersectionListA, noIntersectionListB);
        if (noIntersectionNode != null) {
            System.out.println("Intersection node value: " + noIntersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }

    /**
     * Approach to find an intersection using brute force.
     *
     * @param headA The head of the first linked list.
     * @param headB The head of the second linked list.
     * @return The intersection node if found, or null if no intersection is found.
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        /* Brute Force - Approach 1
         *  The number of nodes of listA is in the m.
         *  The number of nodes of listB is in the n.
         * TC - O(m * n)
         * SC - O(1)
         */
        ListNode p1 = headA;

        while (p1 != null) {
            ListNode p2 = headB;
            while (p2 != null) {
                if (p1 == p2) {
                    return p1;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        return null; // Return null if no intersection is found.
    }

    /**
     * Another approach to find an intersection using brute force.
     *
     * @param headA The head of the first linked list.
     * @param headB The head of the second linked list.
     * @return The intersection node if found, or null if no intersection is found.
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        /* Brute Force - Approach 2
         *  The number of nodes of listA is in the m.
         *  The number of nodes of listB is in the n.
         * TC - O(m + n)
         * SC - O(m)
         */
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode p1 = headA;

        while (p1 != null) {
            map.put(p1.val, p1.next);
            p1 = p1.next;
        }
        ListNode p2 = headB;
        while (p2 != null) {
            if (map.containsValue(p2.next)) {
                return p2.next;
            }
            p2 = p2.next;
        }

        return null;
    }

    /**
     * Optimized approach to find an intersection.
     *
     * @param headA The head of the first linked list.
     * @param headB The head of the second linked list.
     * @return The intersection node if found, or null if no intersection is found.
     */
    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        /* Optimise - Approach 3
         *  The number of nodes of listA is in the m.
         *  The number of nodes of listB is in the n.
         * TC - O(m + n)
         * SC - O(1)
         */
        int m = 0, n = 0, diff = 0;
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != null) {
            p1 = p1.next;
            m++;
        }
        while (p2 != null) {
            p2 = p2.next;
            n++;
        }

        p1 = headA;
        p2 = headB;

        if (m > n) {
            diff = m - n;
            for (int i = 0; i < diff; i++)
                p1 = p1.next;

        } else {
            diff = n - m;
            for (int i = 0; i < diff; i++)
                p2 = p2.next;

        }

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
}
