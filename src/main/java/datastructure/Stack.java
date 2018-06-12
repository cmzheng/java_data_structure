package datastructure;

public class Stack {
    private LinkedList<Integer> list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void push(int i) {
        this.list.addFirst(i);
    }

    public int pop() {
        try {
            return this.list.removeFirst();
        } catch (RuntimeException e) {
            throw new RuntimeException("cannot pop from an empty stack");
        }
    }
}
