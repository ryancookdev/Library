package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class HeapTest
{
    char[] list;

    @Test
    public void sortEmptyList() throws Exception
    {
        list = getChars("");
        Heap heap = new Heap(list);
        heap.sort();
        confirm("");
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        list = getChars("a");
        Heap heap = new Heap(list);
        heap.sort();
        confirm("a");
    }

    @Test
    public void sortSortedList() throws Exception
    {
        list = getChars("abcdefghijklmnopqrstuvwxyz");
        Heap heap = new Heap(list);
        heap.sort();
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        list = getChars("zyxwvutsrqponmlkjihgfedcba");
        Heap heap = new Heap(list);
        heap.sort();
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortRandomList() throws Exception
    {
        list = getChars("roznaqpecgwfbdivmklhjuysxt");
        Heap heap = new Heap(list);
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