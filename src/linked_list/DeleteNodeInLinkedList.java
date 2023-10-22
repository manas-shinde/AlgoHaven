package linked_list;

public class DeleteNodeInLinkedList {
    /**
     * Deletes a node from a singly linked list.
     *
     * @param node The node to be deleted. This node should not be the tail node.
     */
    public void deleteNode(ListNode node) {
        // To delete the node, copy the value of the next node to the current node
        // and adjust the next pointer to skip the next node.
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Select the node to be deleted (e.g., the node with value 2)
        ListNode nodeToDelete = head.next;

        System.out.println("Original List:");
        printList(head);

        // Create an instance of DeleteNodeInLinkedList
        DeleteNodeInLinkedList nodeDeleter = new DeleteNodeInLinkedList();

        // Call the deleteNode method to delete the selected node
        nodeDeleter.deleteNode(nodeToDelete);

        System.out.println("List After Deletion:");
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
}
