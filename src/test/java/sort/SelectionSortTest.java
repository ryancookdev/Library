package software.ryancook.sort;

import org.junit.*;
import java.util.*;
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
        List<Integer> expected = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        selectionSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        List<Integer> list = new ArrayList<>();
        list.add(1);

        selectionSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortOrderedList() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        TestHelper.populateOrderedList(expected, 5);

        List<Integer> list = new ArrayList<>();
        TestHelper.populateOrderedList(list, 5);

        selectionSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortReverseSortedList() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        TestHelper.populateOrderedList(expected, 5);

        List<Integer> list = new ArrayList<>();
        TestHelper.populateReverseOrderedList(list, 5);

        selectionSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortRandomList() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        TestHelper.populateOrderedList(expected, 5);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);

        selectionSort.sort(list);
        assertEquals(expected, list);
    }
}