package ua.edu.ucu.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStack() {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(1);
        assertEquals(1, stack.peek());
        assertEquals(1, stack.pop());
        assertEquals(2, stack.peek());
    }

}
