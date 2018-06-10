package datastructure;

public class LinkedList {
    private Node head;

    // O(1)
    // addFirst: append an element to the beginning of the list
    public void addFirst(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }

    // O(1)
    // removeFirst: retrieve and remove the head of the list
    public int removeFirst() {
        if (head == null) throw new RuntimeException("cannot remove from an empty linked list");
        int ret = head.value;
        head = head.next;
        return ret;
    }

    // O(n)
    public void addLast(int i) {
        if (head == null) {
            head = new Node(i);
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(i);
    }

    // O(n)
    public int removeLast() {
        if (head == null) throw new RuntimeException("connot remove last element from empty linked list");
        if (head.next == null) {
            int ret = head.value;
            head = null;
            return ret;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int ret = node.next.value;
        node.next = null;
        return ret;
    }

    // O(n)
    public int size() {
        int ret = 0;
        Node node = head;
        while (node != null) {
            node = node.next;
            ret += 1;
        }
        return ret;
    }

    public static class Node {
        private int value;
        private Node next;

        public Node(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}