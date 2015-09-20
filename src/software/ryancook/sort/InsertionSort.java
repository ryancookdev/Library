package software.ryancook.sort;

public class InsertionSort
{
    private char[] list;

    public void sort(char[] charList)
    {
        list = charList;
        insertionSort();
    }

    public void insertionSort()
    {
        int lastIndex = list.length - 1;
        for (int i = 1; i <= lastIndex; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j - 1] > list[j]) {
                    swap(j - 1, j);
                }
            }
        }
    }

    private void swap(int a, int b)
    {
        char temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}
