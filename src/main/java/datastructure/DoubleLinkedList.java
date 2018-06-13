package datastructure;

public class DoubleLinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addFirst(T i) {
        size++;
        Node<T> node = new Node<>(i);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(T i) {
        size++;
        Node<T> node = new Node<>(i);
        if (tail == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public T removeFirst() {
        if (head == null) throw new RuntimeException("cannot remove from an empty list");
        T ret = head.value;
        head = head.next;
        if (head != null) head.prev = null;
        if (head == null) tail = null;
        size--;
        return ret;
    }

    public T removeLast() {
        if (tail == null) throw new RuntimeException("cannot remove from an empty list");
        T ret = tail.value;
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

    private class Node<T> {
        private T value;
        private Node<T> prev;
        private Node<T> next;

        Node(T i) {
            this.value = i;
        }
    }
}
