package linked_list;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        // Create a sample linked list for testing palindrome
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Create an instance of PalindromeLinkedList
        PalindromeLinkedList palindromeChecker = new PalindromeLinkedList();

        // Call the isPalindrome method
        boolean isPalindromic = palindromeChecker.isPalindrome1(head);
        if (isPalindromic) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
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
     * Checks if a given linked list is a palindrome.
     *
     * @param head The head node of the linked list.
     * @return True if the linked list is a palindrome, false otherwise.
     */
    public boolean isPalindrome(ListNode head) {
        int n = 0;  // Variable to store the number of nodes in the linked list
        ListNode curr = head;  // Initialize a current pointer at the head of the linked list

        // Count the number of nodes in the linked list
        while (curr != null) {
            curr = curr.next;  // Move to the next node
            n++;  // Increment the count
        }

        int[] arr = new int[n];  // Array to store the values of the linked list nodes
        curr = head;  // Reset the current pointer to the head of the linked list
        int i = 0;  // Index for populating the array

        // Store the values of the linked list nodes in an array
        while (curr != null) {
            arr[i++] = curr.val;  // Store the value in the array and increment the index
            curr = curr.next;  // Move to the next node
        }

        // Check for palindrome
        i = 0;  // Reset index to the beginning of the array
        int j = n - 1;  // Initialize another index at the end of the array

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;  // If values at symmetric positions don't match, it's not a palindrome
            }
            i++;  // Move the first index towards the center
            j--;  // Move the second index towards the center
        }
        return true;  // If all values matched, it's a palindrome
    }


    /**
     * Check if a linked list is a palindrome using reverse and compare method.
     *
     * @param head The head of the linked list.
     * @return True if the linked list is a palindrome, false otherwise.
     */
    public boolean isPalindrome1(ListNode head) {
        // Find the middle of the linked list and split it into two lists.
        ListNode prev = middleNode(head);
        ListNode list2 = prev.next;
        prev.next = null;
        ListNode list1 = head;

        // Reverse the second half of the linked list.
        list2 = reverseList(list2);

        // Compare the values of the two lists to check for palindrome.
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    /**
     * Reverse a linked list.
     *
     * @param head The head of the linked list to be reversed.
     * @return The new head of the reversed linked list.
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
     * Find the middle node of a linked list.
     *
     * @param head The head of the linked list.
     * @return The middle node of the linked list.
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) slow = slow.next;
        }
        return slow;
    }
}
