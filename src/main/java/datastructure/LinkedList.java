package datastructure;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    // O(1)
    // addFirst: append an element to the beginning of the list
    public void addFirst(T i) {
        Node<T> node = new Node<>(i);
        node.next = head;
        head = node;
        size += 1;
    }

    // O(1)
    // removeFirst: retrieve and remove the head of the list
    public T removeFirst() {
        if (head == null) throw new RuntimeException("cannot remove from an empty linked list");
        T ret = head.value;
        head = head.next;
        size -= 1;
        return ret;
    }

    // O(n)
    public void addLast(T i) {
        if (head == null) {
            head = new Node<>(i);
            size += 1;
            return;
        }
        Node<T> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(i);
        size += 1;

    }

    // O(n)
    public T removeLast() {
        if (head == null) throw new RuntimeException("connot remove last element from empty linked list");
        if (head.next == null) {
            T ret = head.value;
            head = null;
            size -= 1;
            return ret;
        }
        Node<T> node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        T ret = node.next.value;
        node.next = null;
        size -= 1;
        return ret;
    }

    // O(1)
    public int size() {
        return size;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        Node(T i) {
            this.value = i;
        }
    }
}