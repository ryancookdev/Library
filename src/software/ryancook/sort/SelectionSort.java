package software.ryancook.sort;

public class SelectionSort implements Sortable
{
    static final boolean asserts = true;
    private char[] list;

    public void sort(char[] charList)
    {
        list = charList;
        selectionSort();
    }

    private void selectionSort()
    {
        // For assertion
        int totalComparisons = 0;

        int lastIndex = list.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= lastIndex; j++) {
                if (asserts) {
                    assertNoSelfComparison(i, j);
                    totalComparisons++;
                }
                if (list[minIndex] > list[j]) {
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
        int triangleNumber = (list.length - 1) * list.length / 2;
        assert (triangleNumber == comparisonTotal) : "Should not exceed n(n+1)/2 total comparisons";
    }

    private static void assertNoSelfComparison(int i, int j)
    {
        assert (i != j) : "No index should be compared with itself";
    }

    private void swap(int a, int b)
    {
        char temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}
