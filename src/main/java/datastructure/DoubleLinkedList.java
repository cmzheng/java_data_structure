package datastructure;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int i) {
        size++;
        Node node = new Node(i);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(int i) {
        size++;
        Node node = new Node(i);
        if (tail == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public int removeFirst() {
        if (head == null) throw new RuntimeException("cannot remove from an empty list");
        int ret = head.value;
        head = head.next;
        if (head != null) head.prev = null;
        if (head == null) tail = null;
        size--;
        return ret;
    }

    public int removeLast() {
        if (tail == null) throw new RuntimeException("cannot remove from an empty list");
        int ret = tail.value;
        if (tail.prev == null) {
            tail = null;
            head = null;
        } else {
            tail.prev.next = null;
            tail = tail.prev;
        }
        size--;
        return ret;
    }

    public int size() {
        return size;
    }

    private static class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            this.value = i;
        }
    }
}
