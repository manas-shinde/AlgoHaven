package stack;
/**
 * A generic stack implementation.
 */
public class Stack<T> {
    private Node<T> head;

    /**
     * Pushes an element onto the stack.
     *
     * @param x The element to push.
     */
    public void push(T x) {
        Node<T> newElement = new Node<>(x);
        newElement.next = head;
        head = newElement;
    }

    /**
     * Pops and returns the top element from the stack.
     *
     * @return The top element, or null if the stack is empty.
     */
    public T pop() {
        if (head == null) {
            return null;
        }

        T val = head.data;
        head = head.next;

        return val;
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public void display(){
        Node<T> curr = this.head;

        while(curr != null){
            System.out.println("| "+curr.data+" |");
            curr = curr.next;
        }
        System.out.println("|____|");
    }

    /**
     * Peeks at the top element of the stack without removing it.
     *
     * @return The top element, or null if the stack is empty.
     */
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    private class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            next = null;
        }
    }
}
