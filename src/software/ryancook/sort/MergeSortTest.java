package software.ryancook.sort;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MergeSortTest
{
    private char[] list;
    private MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void sortEmptyList() throws Exception
    {
        list = getChars("");
        mergeSort.sort(list);
        confirm("");
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        list = getChars("a");
        mergeSort.sort(list);
        confirm("a");
    }

    @Test
    public void sortSortedList() throws Exception
    {
        list = getChars("abcdefghijklmnopqrstuvwxyz");
        mergeSort.sort(list);
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        list = getChars("zyxwvutsrqponmlkjihgfedcba");
        mergeSort.sort(list);
        confirm("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void sortRandomList() throws Exception
    {
        list = getChars("roznaqpecgwfbdivmklhjuysxt");
        mergeSort.sort(list);
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