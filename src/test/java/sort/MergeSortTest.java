package software.ryancook.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MergeSortTest
{
    private MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void sortEmptyList() throws Exception
    {
        char[] list = new char[]{};
        mergeSort.sort(list);
        assertEquals("", new String(list));
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        char[] list = new char[]{'a'};
        mergeSort.sort(list);
        assertEquals("a", new String(list));
    }

    @Test
    public void sortSortedList() throws Exception
    {
        char[] list = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        mergeSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        mergeSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void sortRandomList() throws Exception
    {
        char[] list = "roznaqpecgwfbdivmklhjuysxt".toCharArray();
        mergeSort.sort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }
}