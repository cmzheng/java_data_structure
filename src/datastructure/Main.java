package datastructure;

public class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        try {
            list.removeFirst(); // throw an exception
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
