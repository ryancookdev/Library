package software.ryancook.sort;

import java.util.List;

public class QuickSort implements Sortable
{
    List<Integer> list;

    @Override
    public void sort(List a)
    {
        list = a;
        quickSort(0, list.size() - 1);
    }

    private void quickSort(int lo, int hi)
    {
        if (lo >= hi) {
            return;
        }

        int p = 0;
        if (lo < hi) {
            p = partition(lo, hi);
        }
        quickSort(lo, p - 1);
        quickSort(p + 1, hi);
    }

    private int partition (int lo, int hi)
    {
        Integer pivot = list.get(hi);
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (list.get(j) <= pivot) {
                swap(i, j);
                i++;
            }
        }
        swap(i, hi);
        return i;
    }

    protected void swap(int a, int b)
    {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
