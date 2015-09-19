package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest
{
    @Test
    public void testInsertionSort() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        Library.insertionSort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }

    @Test
    public void testSelectionSort() throws Exception
    {
        char[] list = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        Library.selectionSort(list);
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, new String(list));
    }
}