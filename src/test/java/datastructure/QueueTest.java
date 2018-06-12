package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void testSize() {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        assertEquals(2, queue.size());
        queue.pop();
        assertEquals(1, queue.size());
        queue.pop();
        assertEquals(0, queue.size());
    }
    @Test
    void testPop() {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
    }
}