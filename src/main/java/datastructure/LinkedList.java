package datastructure;

public class LinkedList {
    private Node head;
    private int size = 0;

    // O(1)
    // addFirst: append an element to the beginning of the list
    public void addFirst(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
        size += 1;
    }

    // O(1)
    // removeFirst: retrieve and remove the head of the list
    public int removeFirst() {
        if (head == null) throw new RuntimeException("cannot remove from an empty linked list");
        int ret = head.value;
        head = head.next;
        size -= 1;
        return ret;
    }

    // O(n)
    public void addLast(int i) {
        if (head == null) {
            head = new Node(i);
            size += 1;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(i);
        size += 1;

    }

    // O(n)
    public int removeLast() {
        if (head == null) throw new RuntimeException("connot remove last element from empty linked list");
        if (head.next == null) {
            int ret = head.value;
            head = null;
            size -= 1;
            return ret;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int ret = node.next.value;
        node.next = null;
        size -= 1;
        return ret;
    }

    // O(1)
    public int size() {
        return size;
    }

    private static class Node {
        private int value;
        private Node next;

        Node(int i) {
            this.value = i;
        }
    }
}