package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class InsertionSortTest
{
    private InsertionSort insertionSort;

    @Before
    public void setUp() throws Exception
    {
        insertionSort = new InsertionSort();
    }

    @Test
    public void sortEmptyList() throws Exception
    {
        char[] list = new char[]{};
        insertionSort.sort(list);
        assertEquals("", new String(list));
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        char[] list = new char[]{'a'};
        insertionSort.sort(list);
        assertEquals("a", new String(list));
    }

    @Test
    public void sortSortedList() throws Exception
    {
        char[] list = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        insertionSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        insertionSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortRandomList() throws Exception
    {
        char[] list = "roznaqpecgwfbdivmklhjuysxt".toCharArray();
        insertionSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }
}