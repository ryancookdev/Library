package software.ryancook.sort;

import java.util.List;

public class TestHelper
{
    private TestHelper()
    {
    }

    static void populateOrderedList(List<Integer> list, int count)
    {
        for (int i = 1; i <= count; i++) {
            list.add(i);
        }
    }

    static void populateReverseOrderedList(List<Integer> list, int count)
    {
        for (int i = count; i >= 1; i--) {
            list.add(i);
        }
    }
}