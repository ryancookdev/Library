package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class HeapTest
{
    private Heap heap;

    @Test
    public void sortEmptyList() throws Exception
    {
        char[] list = new char[]{};
        heap = new Heap(list);
        heap.sort();
        assertEquals("", new String(list));
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        char[] list = new char[]{'a'};
        heap = new Heap(list);
        heap.sort();
        assertEquals("a", new String(list));
    }

    @Test
    public void sortSortedList() throws Exception
    {
        char[] list = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        heap = new Heap(list);
        heap.sort();
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        heap = new Heap(list);
        heap.sort();
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortRandomList() throws Exception
    {
        char[] list = "roznaqpecgwfbdivmklhjuysxt".toCharArray();
        heap = new Heap(list);
        heap.sort();
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }
}