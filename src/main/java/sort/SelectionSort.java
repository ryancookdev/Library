package software.ryancook.sort;

import java.util.List;

public class SelectionSort implements Sortable
{
    static final boolean asserts = true;
    private List<Integer> list;

    @Override
    public void sort(List a)
    {
        list = a;
        selectionSort();
    }

    private void selectionSort()
    {
        // For assertion
        int totalComparisons = 0;

        int lastIndex = list.size() - 1;
        for (int i = 0; i < lastIndex; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= lastIndex; j++) {
                if (asserts) {
                    assertNoSelfComparison(i, j);
                    totalComparisons++;
                }
                if (list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }

        if (asserts) {
            assertTriangleNumberComparisons(totalComparisons);
        }
    }

    private void assertTriangleNumberComparisons(int comparisonTotal)
    {
        int triangleNumber = (list.size() - 1) * list.size() / 2;
        assert (triangleNumber == comparisonTotal) : "Should not exceed n(n+1)/2 total comparisons";
    }

    private static void assertNoSelfComparison(int i, int j)
    {
        assert (i != j) : "No index should be compared with itself";
    }

    private void swap(int a, int b)
    {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
