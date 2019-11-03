package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testConstructor() {
        ImmutableList lst = new ImmutableArrayList();
        Object[] expected = new Object[]{};
        assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testAdd() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.add(1);
        Object[] expected1 = new Object[]{1};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.add(2);
        Object[] expected2 = new Object[]{1, 2};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testAddOnIndex() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.add(1);
        lst = lst.add(2);
        lst = lst.add(1, 3);
        Object[] expected = new Object[]{1, 3, 2};
        assertArrayEquals(expected, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddOnIndexError() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.add(1);
        lst = lst.add(2);
        lst = lst.add(2, 3);
    }

    @Test
    public void testAddAll() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected1 = new Object[]{1, 3};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addAll(new Object[]{2, 1});
        Object[] expected2 = new Object[]{1, 3, 2, 1};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test
    public void testAddAllIndex() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected1 = new Object[]{1, 3};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addAll(1, new Object[]{2, 1});
        Object[] expected2 = new Object[]{1, 2, 1, 3};
        assertArrayEquals(expected2, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndexError() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected1 = new Object[]{1, 3};
        assertArrayEquals(expected1, lst.toArray());
        lst = lst.addAll(-1, new Object[]{2, 1});
    }

    @Test
    public void testGet() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        assertEquals(3, lst.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetError() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        lst.get(3);
    }

    @Test
    public void testRemove() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        Object[] expected = new Object[]{1, 2};
        lst = lst.remove(1);
        assertArrayEquals(expected, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveError() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        lst = lst.remove(3);
    }

    @Test
    public void testSet() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        Object[] expected = new Object[]{1, 4, 2};
        lst = lst.set(1, 4);
        assertArrayEquals(expected, lst.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetError() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        lst.set(-1, 4);
    }

    @Test
    public void testIndexOf() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        assertEquals(1, lst.indexOf(3));
        assertEquals(-1, lst.indexOf(4));
    }

    @Test
    public void testSize() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3});
        assertEquals(2, lst.size());
        lst = lst.addAll(new Object[]{2, 1});
        assertEquals(4, lst.size());
    }

    @Test
    public void testClear() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3});
        Object[] expected = new Object[]{};
        lst = lst.clear();
        assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testIsEmpty() {
        ImmutableList lst = new ImmutableArrayList();
        assertEquals(true, lst.isEmpty());
        lst = lst.add(1);
        assertEquals(false, lst.isEmpty());
    }

    @Test
    public void testToArray() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        Object[] expected = new Object[]{1, 3, 2};
        assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testToString() {
        ImmutableList lst = new ImmutableArrayList();
        lst = lst.addAll(new Object[]{1, 3, 2});
        String expected = "1,3,2";
        assertEquals(expected, lst.toString());
    }
}
