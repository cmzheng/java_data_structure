package datastructure;

public class LinkedList {
    // addFirst: append an element to the beginning of the list
    public void addFirst(int i) {

    }
    // removeFirst: retrieve and remove the head of the list
    public int removeFirst() {

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