package software.ryancook.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest
{
    private SelectionSort selectionSort;

    @Before
    public void setUp() throws Exception
    {
        selectionSort = new SelectionSort();
    }

    @Test
    public void sortEmptyList() throws Exception
    {
        char[] list = new char[]{};
        selectionSort.sort(list);
        assertEquals("", new String(list));
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        char[] list = new char[]{'a'};
        selectionSort.sort(list);
        assertEquals("a", new String(list));
    }

    @Test
    public void sortSortedList() throws Exception
    {
        char[] list = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        selectionSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        selectionSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortRandomList() throws Exception
    {
        char[] list = "roznaqpecgwfbdivmklhjuysxt".toCharArray();
        selectionSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }
}