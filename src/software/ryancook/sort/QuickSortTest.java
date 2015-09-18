package software.ryancook.sort;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest
{
    private char[] list;
    private QuickSort quickSort;

    @Before
    public void setUp() throws Exception
    {
        quickSort = new QuickSort();
    }

    @Test
    public void sortEmptyList() throws Exception
    {
        list = getChars("");
        quickSort.sort(list);
        confirm("");
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        list = getChars("a");
        quickSort.sort(list);
        confirm("a");
    }

    @Test
    public void sortSortedList() throws Exception
    {
        list = getChars("abcdefghijklmnopqrstuvwxyz");
        quickSort.sort(list);
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        list = getChars("zyxwvutsrqponmlkjihgfedcba");
        quickSort.sort(list);
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortRandomList() throws Exception
    {
        list = getChars("roznaqpecgwfbdivmklhjuysxt");
        quickSort.sort(list);
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