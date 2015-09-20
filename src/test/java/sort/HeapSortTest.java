package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class HeapSortTest
{
    private HeapSort heapSort;

    @Before
    public void setUp() throws Exception
    {
        heapSort = new HeapSort();
    }

    @Test
    public void sortEmptyList() throws Exception
    {
        char[] list = new char[]{};
        heapSort.sort(list);
        assertEquals("", new String(list));
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        char[] list = new char[]{'a'};
        heapSort.sort(list);
        assertEquals("a", new String(list));
    }

    @Test
    public void sortSortedList() throws Exception
    {
        char[] list = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        heapSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        heapSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortRandomList() throws Exception
    {
        char[] list = "roznaqpecgwfbdivmklhjuysxt".toCharArray();
        heapSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }
}