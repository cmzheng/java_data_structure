package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
    @Test
    void testAddAndRemoveFirst() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.removeFirst());
        assertEquals(1, list.removeFirst());
    }
    @Test
    void testAddAndRemoveLast() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.removeLast());
        assertEquals(1, list.removeLast());
    }
    @Test
    void testSize() {
        DoubleLinkedList list = new DoubleLinkedList();
        assertEquals(0, list.size());
        list.addFirst(1);
        assertEquals(1, list.size());
        list.addFirst(2);
        assertEquals(2, list.size());
        list.addFirst(3);
        assertEquals(3, list.size());
        assertEquals(3, list.removeFirst());
        assertEquals(2, list.size());
        assertEquals(2, list.removeFirst());
        assertEquals(1, list.size());
        assertEquals(1, list.removeFirst());
        assertEquals(0, list.size());
    }
}