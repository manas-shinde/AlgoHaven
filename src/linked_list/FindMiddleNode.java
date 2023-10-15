package linked_list;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class FindMiddleNode {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // Create an instance of FindMiddleNode
        FindMiddleNode middleNodeFinder = new FindMiddleNode();

        // Find and print the middle node
        ListNode middle = middleNodeFinder.middleNode(node1);
        System.out.println("Middle Node: " + middle.val);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while ( fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
