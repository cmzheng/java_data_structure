package datastructure;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    @Test
    void testList() {
        List<Integer> list = new DoubleLinkedList<>();
        assertEquals(0, list.size());
        list.addFirst(1);
        assertEquals(Integer.valueOf(1), list.removeLast());
    }
}