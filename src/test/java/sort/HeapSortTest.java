package software.ryancook.sort;

import org.junit.*;
import java.util.*;
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
        List<Integer> expected = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        heapSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortListWithOneItem() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        List<Integer> list = new ArrayList<>();
        list.add(1);

        heapSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortOrderedList() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        TestHelper.populateOrderedList(expected, 5);

        List<Integer> list = new ArrayList<>();
        TestHelper.populateOrderedList(list, 5);

        heapSort.sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void sortReverseOrderedList() throws Exception
    {
        List<Integer> expected = new ArrayList<>();
        TestHelper.populateOrderedList(expected, 5);

        List<Integer> list = new ArrayList<>();
        TestHelper.populateReverseOrderedList(list, 5);

        heapSort.sort(list);
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
        list.add(4);
        list.add(2);

        heapSort.sort(list);
        assertEquals(expected, list);
    }
}