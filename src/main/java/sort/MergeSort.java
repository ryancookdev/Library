package software.ryancook.sort;

import java.util.*;

public class MergeSort implements Sortable
{
    List<Integer> list;
    List<Integer> tempList;

    @Override
    public void sort(List a) {
        list = a;
        tempList = new ArrayList<>(5);
        prefillZeroes(tempList, list.size());
        topDownSplitMerge(0, list.size());
    }

    private void prefillZeroes(List list, int size)
    {
        for (int i = 0; i < size; i++) {
            list.add(0);
        }
    }

    private void topDownSplitMerge(int iBegin, int iEnd)
    {
        if (iEnd - iBegin < 2) {
            return;
        }

        int iMiddle = (iEnd + iBegin) / 2;
        topDownSplitMerge(iBegin, iMiddle);
        topDownSplitMerge(iMiddle, iEnd);
        topDownMerge(iBegin, iMiddle, iEnd);
        copyList(iBegin, iEnd);
    }

    private void copyList(int iBegin, int iEnd)
    {
        for (int i = iBegin; i < iEnd; i++) {
            list.set(i, tempList.get(i));
        }
    }

    private void topDownMerge(int iBegin, int iMiddle, int iEnd)
    {
        int headFirstHalf = iBegin;
        int headSecondHalf = iMiddle;

        for (int i = iBegin; i < iEnd; i++) {
            if (headFirstHalf < iMiddle
                    && (headSecondHalf >= iEnd
                    || list.get(headFirstHalf) <= list.get(headSecondHalf))) {
                tempList.set(i, list.get(headFirstHalf));
                headFirstHalf = headFirstHalf + 1;
            } else {
                tempList.set(i, list.get(headSecondHalf));
                headSecondHalf = headSecondHalf + 1;
            }
        }
    }
}
