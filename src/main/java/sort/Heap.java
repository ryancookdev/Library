package software.ryancook.sort;

public class Heap
{
    private static final int PARENT_CHILD_INDEX_MULTIPLIER = 2;
    char[] list;

    public Heap(char[] list)
    {
        this.list = list;
        heapify();
    }

    public void sort()
    {
        for (int i = getLastIndex(); i >= 0; i--) {
            swap(0, i);
            siftDown(0, i - 1);
        }
    }

    private void heapify()
    {
        int lastParentIndex = getParentIndex(getLastIndex());
        int lastIndex = getLastIndex();
        for (int i = lastParentIndex; i >= 0; i--) {
            siftDown(i, lastIndex);
        }
    }

    private void siftDown(int index, int end) {
        while (true) {
            int leftChild = getLeftChildIndex(index);
            int rightChild = getRightChildIndex(index);

            boolean noChildren = (leftChild > end);
            if (noChildren) {
                return;
            }

            int maxChild = getMaxChild(end, leftChild, rightChild);
            boolean heapOrdered = (list[index] >= list[maxChild]);
            if (heapOrdered) {
                return;
            }

            swap(index, maxChild);
            index = maxChild;
        }
    }

    private int getMaxChild(int end, int leftChild, int rightChild) {
        if (rightChild > end) {
            return leftChild;
        } else if (list[leftChild] > list[rightChild]) {
            return leftChild;
        } else {
            return rightChild;
        }
    }

    private int getLastIndex()
    {
        return list.length - 1;
    }

    private int getParentIndex(int index)
    {
        return Math.floorDiv(
            index + 1,
            PARENT_CHILD_INDEX_MULTIPLIER
        ) - 1;
    }

    private int getLeftChildIndex(int index)
    {
        return getRightChildIndex(index) - 1;
    }

    private int getRightChildIndex(int index)
    {
        return (index + 1) * PARENT_CHILD_INDEX_MULTIPLIER;
    }

    private void swap(int a, int b)
    {
        char temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}
