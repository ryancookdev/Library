package software.ryancook.sort;

import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest
{
    char[] list;

    @Before
    public void setUp() throws Exception {
        list = getChars("ryancookiedough");
    }

    @Test
    public void testInsertionSort() throws Exception
    {
        Library.insertionSort(list);
        confirm("acdeghiknoooruy");
    }

    @Test
    public void testSelectionSort() throws Exception
    {
        Library.selectionSort(list);
        confirm("acdeghiknoooruy");
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