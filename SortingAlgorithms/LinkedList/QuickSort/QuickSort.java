package LinkedList.QuickSort;

import java.util.List;
import java.util.Random;

public class QuickSort {
    private List<Integer> data;

    public QuickSort(List<Integer> data) {
        this.data = data;
    }

    public void quickSort() {
        quickSort(0, (data.size() - 1));
    }

    private void quickSort(Integer minPos, Integer maxPos) {
        Integer pivot, pivotPos, leftPos, rightPos;

        if (minPos >= maxPos)
            return;

        Random random = new Random();
        pivotPos = random.nextInt(maxPos - minPos + 1) + minPos;
        pivot = data.get(pivotPos);

        if (pivotPos != maxPos)
        {
            swap(pivotPos, maxPos);
            System.out.println(data);
        }
        leftPos = minPos;
        rightPos = maxPos;

        while (leftPos < rightPos) {
            while (data.get(leftPos) <= pivot && leftPos < rightPos)
                leftPos++;
            while (data.get(rightPos) >= pivot && leftPos < rightPos)
                rightPos--;
            if (leftPos < rightPos) {
                swap(leftPos, rightPos);
                System.out.println(data);
            }
        }

        if (data.get(leftPos) > pivot) {
            swap(leftPos, maxPos);
            System.out.println(data);
        }
        quickSort(minPos, (leftPos - 1));
        quickSort((leftPos + 1), maxPos);
    }

    private void swap(Integer pos1, Integer pos2) {
        Integer temp = data.get(pos1);
        data.set(pos1, data.get(pos2));
        data.set(pos2, temp);
    }
}
