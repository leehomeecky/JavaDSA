package LinkedList.MergeSort;

import java.util.LinkedList;
import java.util.List;

public class MergeSort {
    private List<Integer> listData;

    public MergeSort(List<Integer> data) {
        this.listData = data;
    }

    private void mergeSort(List<Integer> data) {
        Integer midPoint = data.size() / 2, i, listLength = data.size();

        if (listLength < 2)
            return;
        List<Integer> leftList = new LinkedList<Integer>();
        List<Integer> rightList = new LinkedList<Integer>();

        for (i = 0; i < midPoint; i++)
            leftList.add(i, data.get(i));
        for (i = midPoint; i < listLength; i++)
            rightList.add((i - midPoint), data.get(i));

        mergeSort(leftList);
        System.out.println(leftList);
        mergeSort(rightList);
        System.out.println(rightList);
        mrege(data, leftList, rightList);
        System.out.println(data);
    }

    public void mergeSort() {
        mergeSort(listData);
    }

    private void mrege(List<Integer> data, List<Integer> leftList, List<Integer> rightList) {
        Integer i = 0, j = 0, k = 0;

        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) < rightList.get(j)) {
                data.set(k, leftList.get(i));
                i++;
            } else {
                data.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        for(; i < leftList.size(); i++, k++)
            data.set(k, leftList.get(i));
        for(; j < rightList.size(); j++, k++)
            data.set(k, rightList.get(j));
    }
}
