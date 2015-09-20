package software.ryancook.sort;

public class MergeSort implements Sortable
{
    char[] list;
    char[] tempList;

    public void sort(char[] charList) {
        list = charList;
        tempList = new char[list.length];
        topDownSplitMerge(0, list.length);
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
        copyArray(iBegin, iEnd);
    }

    private void copyArray(int iBegin, int iEnd)
    {
        int length = iEnd - iBegin;
        System.arraycopy(tempList, iBegin, list, iBegin, length);
    }

    private void topDownMerge(int iBegin, int iMiddle, int iEnd)
    {
        int headFirstHalf = iBegin;
        int headSecondHalf = iMiddle;

        for (int i = iBegin; i < iEnd; i++) {
            if (headFirstHalf < iMiddle && (headSecondHalf >= iEnd || list[headFirstHalf] <= list[headSecondHalf])) {
                tempList[i] = list[headFirstHalf];
                headFirstHalf = headFirstHalf + 1;
            } else {
                tempList[i] = list[headSecondHalf];
                headSecondHalf = headSecondHalf + 1;
            }
        }
    }
}
