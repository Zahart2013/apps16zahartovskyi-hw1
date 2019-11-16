package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testConstructor() {
        ImmutableList lst = new ImmutableLinkedList();
        Object[] expected = new Object[]{};
        assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testAdd() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.add(1);
        Object[] expected1 = new Object[]{1};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.add(2);
        Object[] expected2 = new Object[]{1, 2};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testAddOnIndex() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.add(1);
        lst = lst.add(2);
        lst = lst.add(1, 3);
        Object[] expected = new Object[]{1, 3, 2};
        assertArrayEquals(expected, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddOnIndexError() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.add(1);
        lst = lst.add(2);
        lst = lst.add(3, 3);
    }

    @Test
    public void testAddAll() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected1 = new Object[]{1, 3};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addAll(new Object[]{2, 1});
        Object[] expected2 = new Object[]{1, 3, 2, 1};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testAddAllIndex() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected1 = new Object[]{1, 3};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addAll(1, new Object[]{2, 1});
        Object[] expected2 = new Object[]{1, 2, 1, 3};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndexError() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected1 = new Object[]{1, 3};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addAll(-1, new Object[]{2, 1});
    }

    @Test
    public void testGet() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        assertEquals(3, lst.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetError() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        lst.get(3);
    }

    @Test
    public void testRemove() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        Object[] expected = new Object[]{1, 2};
        lst = lst.remove(1);
        assertArrayEquals(expected, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveError() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        lst = lst.remove(3);
    }

    @Test
    public void testSet() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        Object[] expected = new Object[]{1, 4, 2};
        lst = lst.set(1, 4);
        assertArrayEquals(expected, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetError() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        lst.set(-1, 4);
    }

    @Test
    public void testIndexOf() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        assertEquals(1, lst.indexOf(3));
        assertEquals(-1, lst.indexOf(4));
    }

    @Test
    public void testSize() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3});
        assertEquals(2, lst.size());
        lst = lst.addAll(new Object[]{2, 1});
        assertEquals(4, lst.size());
    }

    @Test
    public void testClear() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected = new Object[]{};
        lst = lst.clear();
        assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testIsEmpty() {
        ImmutableList lst = new ImmutableLinkedList();
        assertEquals(true, lst.isEmpty());
        lst = lst.add(1);
        assertEquals(false, lst.isEmpty());
    }

    @Test
    public void testToArray() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        Object[] expected = new Object[]{1, 3, 2};
        assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testToString() {
        ImmutableList lst = new ImmutableLinkedList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        String expected = "1,3,2";
        assertEquals(expected, lst.toString());
    }

    @Test
    public void testAddFirst() {
        ImmutableLinkedList lst = new ImmutableLinkedList();
        lst = lst.addFirst(1);
        Object[] expected1 = new Object[]{1};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addFirst(2);
        Object[] expected2 = new Object[]{2, 1};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testAddLast() {
        ImmutableLinkedList lst = new ImmutableLinkedList();
        lst = lst.addLast(1);
        Object[] expected1 = new Object[]{1};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addLast(2);
        Object[] expected2 = new Object[]{1, 2};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testGetFirst() {
        ImmutableLinkedList lst = new ImmutableLinkedList();
        lst = lst.addFirst(1);
        assertEquals(1, lst.getFirst());
        lst = lst.addFirst(2);
        assertEquals(2, lst.getFirst());
    }

    @Test
    public void testGetLast() {
        ImmutableLinkedList lst = new ImmutableLinkedList();
        lst = lst.addFirst(1);
        assertEquals(1, lst.getLast());
        lst = lst.addFirst(2);
        assertEquals(1, lst.getLast());
    }

    @Test
    public void testRemoveFirst() {
        ImmutableLinkedList lst = new ImmutableLinkedList();
        lst = lst.addFirst(1);
        lst = lst.addFirst(2);
        lst = lst.removeFirst();
        Object[] expected1 = new Object[]{1};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.removeFirst();
        Object[] expected2 = new Object[]{};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testRemoveLast() {
        ImmutableLinkedList lst = new ImmutableLinkedList();
        lst = lst.addFirst(1);
        lst = lst.addFirst(2);
        lst = lst.removeLast();
        Object[] expected1 = new Object[]{2};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.removeLast();
        Object[] expected2 = new Object[]{};
        assertArrayEquals(expected2, lst.toArray());
    }
}
