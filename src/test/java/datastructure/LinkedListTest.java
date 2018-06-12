package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    
    @Test
    void testAddFirst() {
        LinkedList<Integer> list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(2), list.removeFirst());
        assertEquals(Integer.valueOf(1), list.removeFirst());
        assertEquals(0, list.size());
    }

    @Test
    void testAddLast() {
        LinkedList<String> list = new LinkedList();
        list.addLast("item1");
        list.addLast("item2");
        assertEquals("item2", list.removeLast());
        assertEquals("item1", list.removeLast());
    }
}