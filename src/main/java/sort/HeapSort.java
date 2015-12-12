package software.ryancook.sort;

import java.util.List;

public class HeapSort implements Sortable
{
    private static final int PARENT_CHILD_INDEX_MULTIPLIER = 2;
    List<Integer> list;

    @Override
    public void sort(List a)
    {
        list = a;
        heapify();
        heapSort();
    }

    private void heapSort()
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
            boolean heapOrdered = (list.get(index) >= list.get(maxChild));
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
        } else if (list.get(leftChild) > list.get(rightChild)) {
            return leftChild;
        } else {
            return rightChild;
        }
    }

    private int getLastIndex()
    {
        return list.size() - 1;
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

    protected void swap(int a, int b)
    {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
