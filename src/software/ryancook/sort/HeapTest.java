package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class HeapTest
{
    char[] list;
    private Heap heap;

    @Test
    public void sortEmptyList() throws Exception
    {
        list = getChars("");
        heap = new Heap(list);
        heap.sort();
        confirm("");
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        list = getChars("a");
        heap = new Heap(list);
        heap.sort();
        confirm("a");
    }

    @Test
    public void sortSortedList() throws Exception
    {
        list = getChars("abcdefghijklmnopqrstuvwxyz");
        heap = new Heap(list);
        heap.sort();
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        list = getChars("zyxwvutsrqponmlkjihgfedcba");
        heap = new Heap(list);
        heap.sort();
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortRandomList() throws Exception
    {
        list = getChars("roznaqpecgwfbdivmklhjuysxt");
        heap = new Heap(list);
        heap.sort();
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    private char[] getChars(String s)
    {
        return s.toCharArray();
    }

    private void confirm(String expected)
    {
        assertEquals(expected, new String(list));
    }
}