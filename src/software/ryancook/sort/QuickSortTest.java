package software.ryancook.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest
{
    private Sortable sortable;

    @Before
    public void setUp() throws Exception
    {
        sortable = new QuickSort();
    }

    @Test
    public void sortEmptyListOfChars() throws Exception
    {
        char[] charList = new char[]{};
        sortable.sort(charList);
        assertEquals("", new String(charList));
    }

    /*@Test
    public void sortEmptyListOfInts() throws Exception
    {
        int[] intList = new int[0];
        sortable.sort(list);
        confirm("");
    }*/

    @Test
    public void sortListWithOneChar() throws Exception
    {
        char[] charList = new char[]{'a'};
        sortable.sort(charList);
        assertEquals("a", new String(charList));
    }

    @Test
    public void sortSortedListOfChars() throws Exception
    {
        char[] charList = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        sortable.sort(charList);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(charList));
    }

    @Test
    public void sortReverseSortedListOfChars() throws Exception
    {
        char[] charList = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        sortable.sort(charList);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(charList));
    }

    @Test
    public void sortRandomListOfChars() throws Exception
    {
        char[] charList = "roznaqpecgwfbdivmklhjuysxt".toCharArray();
        sortable.sort(charList);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(charList));
    }
}