package software.ryancook.sort;

public class Library
{
    private static void swap(char[] list, int a, int b)
    {
        char temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static void selectionSort(char[] list)
    {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }

    public static void insertionSort(char[] list)
    {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j - 1] > list[j]) {
                    swap(list, j - 1, j);
                }
            }
        }
    }
}
