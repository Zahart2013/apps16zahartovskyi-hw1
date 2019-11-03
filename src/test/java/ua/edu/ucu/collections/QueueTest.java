package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void testQueue() {
        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(1);
        assertEquals(2, queue.peek());
        assertEquals(2, queue.dequeue());
        assertEquals(1, queue.peek());
    }
    
}
