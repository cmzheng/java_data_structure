package datastructure;

public class LinkedList {
    private Node head;
    // addFirst: append an element to the beginning of the list
    public void addFirst(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }
    // removeFirst: retrieve and remove the head of the list
    public int removeFirst() {
        if (head == null) throw new RuntimeException("cannot remove from an empty linked list");
        int ret = head.value;
        head = head.next;
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