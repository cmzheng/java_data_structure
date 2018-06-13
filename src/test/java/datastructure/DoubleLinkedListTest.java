package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
    @Test
    void testAddAndRemoveFirst() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(Integer.valueOf(2), list.removeFirst());
        assertEquals(Integer.valueOf(1), list.removeFirst());
    }
    @Test
    void testAddAndRemoveLast() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(Integer.valueOf(2), list.removeLast());
        assertEquals(Integer.valueOf(1), list.removeLast());
    }
    @Test
    void testSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertEquals(0, list.size());
        list.addFirst(1);
        assertEquals(1, list.size());
        list.addFirst(2);
        assertEquals(2, list.size());
        list.addFirst(3);
        assertEquals(3, list.size());
        list.removeFirst();
        assertEquals(2, list.size());
        list.removeFirst();
        assertEquals(1, list.size());
        list.removeFirst();
        assertEquals(0, list.size());
    }
}