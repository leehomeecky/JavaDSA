package Array.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void quickSort() {
        quickSort(0, (array.length - 1));
    }

    private void quickSort(int minPos, int maxPos) {
        int pivotPos, pivot, leftPos, rightPos;

        if (minPos >= maxPos)
            return;

        Random random = new Random();
        pivotPos = random.nextInt(maxPos - minPos + 1) + minPos;
        pivot = array[pivotPos];
        if (maxPos != pivotPos)
        {
            swap(maxPos, pivotPos);
            System.out.println(Arrays.toString(array));
        }
        leftPos = minPos;
        rightPos = maxPos;
        while (leftPos < rightPos) {
            while (array[leftPos] <= pivot && leftPos < rightPos)
                leftPos++;
            while (array[rightPos] >= pivot && leftPos < rightPos)
                rightPos--;
            if (rightPos != leftPos) {
                swap(rightPos, leftPos);
                System.out.println(Arrays.toString(array));
            }
        }
        if (array[leftPos] > array[maxPos])
        {
            swap(leftPos, maxPos);
            System.out.println(Arrays.toString(array));
        }
        quickSort(minPos, (leftPos - 1));
        quickSort((leftPos + 1), maxPos);
    }
    
    private void swap(int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
