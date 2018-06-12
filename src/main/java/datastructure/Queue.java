package datastructure;

public class Queue {
    private DoubleLinkedList list;

    public Queue() {
        this.list = new DoubleLinkedList();
    }
    public void push(int i) {
        list.addFirst(i);
    }

    public int pop() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }

}
