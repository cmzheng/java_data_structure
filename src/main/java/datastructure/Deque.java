package datastructure;

public class Deque {
    private DoubleLinkedList list;

    public Deque() {
        this.list = new DoubleLinkedList();
    }

    public int size() {
        return list.size();
    }

    public void pushFirst(int i) {
        list.addFirst(i);
    }

    public void pushLast(int i) {
        list.addLast(i);
    }

    public int popFirst() {
        return list.removeFirst();
    }

    public int popLast() {
        return list.removeLast();
    }
}
