package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    
    @Test
    void testAddFirst() {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.size());
        assertEquals(2, list.removeFirst());
        assertEquals(1, list.removeFirst());
        assertEquals(0, list.size());
    }
}