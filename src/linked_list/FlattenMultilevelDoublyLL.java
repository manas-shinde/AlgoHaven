package linked_list;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenMultilevelDoublyLL {
    public static void main(String[] args) {
        // Create nodes for the sample multilevel doubly linked list
        Node head = new Node();
        head.val = 1;

        Node node2 = new Node();
        node2.val = 2;
        head.next = node2;
        node2.prev = head;

        Node node3 = new Node();
        node3.val = 3;
        node2.next = node3;
        node3.prev = node2;

        Node node4 = new Node();
        node4.val = 4;
        node3.next = node4;
        node4.prev = node3;

        Node node5 = new Node();
        node5.val = 5;
        node4.next = node5;
        node5.prev = node4;

        Node node6 = new Node();
        node6.val = 6;
        node5.next = node6;
        node6.prev = node5;

        Node node7 = new Node();
        node7.val = 7;
        node3.child = node7;
        node7.prev = null;

        Node node8 = new Node();
        node8.val = 8;
        node7.next = node8;
        node8.prev = node7;

        Node node9 = new Node();
        node9.val = 9;
        node8.next = node9;
        node9.prev = node8;

        Node node10 = new Node();
        node10.val = 10;
        node9.next = node10;
        node10.prev = node9;

        Node node11 = new Node();
        node11.val = 11;
        node8.child = node11;
        node11.prev = null;

        Node node12 = new Node();
        node12.val = 12;
        node11.next = node12;
        node12.prev = node11;


        // Create an instance of FlattenMultilevelDoublyLL
        FlattenMultilevelDoublyLL flattener = new FlattenMultilevelDoublyLL();

        // Call the flatten method to flatten the list
        Node flattenedHead = flattener.flatten1(head);

        // Print the flattened linked list
        while (flattenedHead != null) {
            System.out.print(flattenedHead.val + " <-> ");
            flattenedHead = flattenedHead.next;
        }
        System.out.println("null");
    }

    public Node flatten1(Node head) {
        if (head == null) return head;
        // Pointer
        Node p = head;
        while (p != null) {
            /* CASE 1: if no child, proceed */
            if (p.child == null) {
                p = p.next;
                continue;
            }
            /* CASE 2: got child, find the tail of the child and link it to p.next */
            Node temp = p.child;
            // Find the tail of the child
            while (temp.next != null)
                temp = temp.next;
            // Connect tail with p.next, if it is not null
            temp.next = p.next;
            if (p.next != null) p.next.prev = temp;
            // Connect p with p.child, and remove p.child
            p.next = p.child;
            p.child.prev = p;
            p.child = null;
        }
        return head;
    }

    /**
     * Flatten a multilevel doubly linked list.(Brute Force approach)
     * TC - O(n)
     * SC - O(n)
     *
     * @param head The head of the multilevel doubly linked list.
     * @return The flattened doubly linked list.
     */
    public Node flatten(Node head) {
        Node curr = head;
        Node next = null;
        List<Node> list = new ArrayList<>();

        while (curr.next != null) {
            // Iterate until the end of the current level or until a child node is encountered
            curr = iterateTillChild(curr);

            if (curr.next != null) {
                next = curr.next;
                list.add(next);

                // Connect the current node to the child node and update pointers
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                curr = curr.next;
            }
        }

        int n = list.size();

        while (n > 0) {
            // Retrieve a node from the list
            next = list.get(n - 1);

            // Connect the current node to the next node and update pointers
            curr.next = next;
            next.prev = curr;

            curr = curr.next;

            // Iterate until the end of the current level or until a child node is encountered
            curr = iterateTillChild(curr);

            // Remove the processed node from the list
            list.remove(n - 1);
            n--;
        }
        return head;
    }

    /**
     * Iterate until the end of the current level or until a child node is encountered.
     *
     * @param head The current node.
     * @return The last node in the current level.
     */
    public Node iterateTillChild(Node head) {
        while (head.child == null && head.next != null) {
            head = head.next;
        }
        return head;
    }
}
