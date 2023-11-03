package linked_list;

public class DoublyLL {
    Node head;

    /**
     * Display the elements of the linked list.
     */
    public void display() {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data + " <--> ");
            cur = cur.next;
        }
        System.out.println("NULL");
    }

    public void insertFirst(int data) {
        Node temp = new Node(data);

        if (this.head == null) {
            this.head = temp;
            return;
        }

        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    public void insertLast(int data) {
        if (this.head == null) {
            insertFirst(data);
            return;
        }
        Node temp = new Node(data);

        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;
    }

    public int insertAt(int data, int idx) {
        if (this.head == null) {
            return -1; // Linked list is empty.
        }
        if (idx < 0) {
            return -1; // Invalid index.
        }

        Node temp = new Node(data);
        Node cur = this.head;
        try {
            for (int i = 0; i < idx - 1; i++)
                cur = cur.next;
        } catch (NullPointerException e) {
            throw new NullPointerException("Given index can't be found in the current linked list.");
        }

        temp.next = cur.next;
        temp.next.prev = temp;
        cur.next = temp;
        temp.prev = cur;
        return 1; // Node inserted successfully.
    }

    /**
     * Delete the first node from the linked list.
     */
    public void deleteFirst() {
        Node curr = this.head;

        head = head.next;
        curr.next = null;
        head.prev = null;
    }

    /**
     * Delete the last node from the linked list.
     */
    public void deleteLast() {
        Node curr = this.head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        Node last = curr.next;
        curr.next = null;
        last.prev = null;
    }

    /**
     * Delete the node at the specified index (0-based).
     *
     * @param idx The index of the node to be deleted.
     * @return 1 if the node is deleted successfully, -1 for failure.
     */
    public int deleteAt(int idx) {
        if (this.head == null) {
            return -1; // Linked list is empty.
        }
        if (idx < 0) {
            return -1; // Invalid index.
        }

        Node cur = this.head;
        for (int i = 0; i < idx - 1; i++) {
            cur = cur.next;
        }
        Node temp = cur.next;
        cur.next = temp.next;
        temp.next.prev = cur;
        temp.prev = null;
        temp.next = null;
        return 1; // Node deleted successfully.
    }

    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
