package software.ryancook.sort;

public class Heap
{
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
        // Call siftDown() for every parent node, last to first
        int lastParentIndex = getParentIndex(getLastIndex());
        int lastIndex = getLastIndex();
        for (int i = lastParentIndex; i >= 0; i--) {
            siftDown(i, lastIndex);
        }
    }

    // Improved version
    private void siftDown(int index, int end)
    {
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
        siftDown(maxChild, end);
    }

    private int getMaxChild(int end, int leftChild, int rightChild) {
        int maxChild;
        if (rightChild > end) {
            maxChild = leftChild;
        } else if (list[leftChild] > list[rightChild]) {
            maxChild = leftChild;
        } else {
            maxChild = rightChild;
        }
        return maxChild;
    }

    private int getLastIndex()
    {
        return list.length - 1;
    }

    private int getParentIndex(int childIndex)
    {
        return Math.floorDiv(childIndex + 1, 2) - 1;
    }

    private int getLeftChildIndex(int parentIndex)
    {
        return getRightChildIndex(parentIndex) - 1;
    }

    private int getRightChildIndex(int parentIndex)
    {
        return (parentIndex + 1) * 2;
    }

    private void swap(int a, int b)
    {
        char temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}
