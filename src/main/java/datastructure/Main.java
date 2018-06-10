package datastructure;

public class Main {
    public static void main(String args[]) {
        // LinkedList
        LinkedList list = new LinkedList();
        System.out.println("size = " + list.size());
        list.addFirst(1);
        System.out.println("size = " + list.size());
        list.addFirst(2);
        System.out.println("size = " + list.size());
        list.addLast(3);
        System.out.println("size = " + list.size());
        System.out.println(list.removeLast());
        System.out.println("size = " + list.size());
        System.out.println(list.removeFirst());
        System.out.println("size = " + list.size());
        System.out.println(list.removeFirst());

        try {
            list.removeFirst(); // throw an exception
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        // Stack
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
