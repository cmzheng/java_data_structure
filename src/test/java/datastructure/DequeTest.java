package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeTest {
    @Test
    void testSize() {
        Deque deque = new Deque();
        deque.pushFirst(1);
        deque.pushLast(2);
        assertEquals(2, deque.size());
        deque.popFirst();
        assertEquals(1, deque.size());
        deque.popLast();
        assertEquals(0, deque.size());
    }

    @Test
    void testPopFirst() {
        Deque deque = new Deque();
        deque.pushFirst(1);
        deque.pushFirst(2);
        deque.pushLast(3);
        assertEquals(2, deque.popFirst());
        assertEquals(1, deque.popFirst());
        assertEquals(3, deque.popFirst());
    }

    @Test
    void testPopLast() {
        Deque deque = new Deque();
        deque.pushFirst(1);
        deque.pushLast(3);
        assertEquals(3, deque.popLast());
        assertEquals(1, deque.popLast());
    }



}