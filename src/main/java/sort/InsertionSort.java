package software.ryancook.sort;

import java.util.List;

public class InsertionSort implements Sortable
{
    private List<Integer> list;

    @Override
    public void sort(List a)
    {
        list = a;
        insertionSort();
    }

    public void insertionSort()
    {
        int lastIndex = list.size() - 1;
        for (int i = 1; i <= lastIndex; i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j - 1) > list.get(j)) {
                    swap(j - 1, j);
                }
            }
        }
    }

    protected void swap(int a, int b)
    {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
