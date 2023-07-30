package Array.MergeSort;

import java.util.Arrays;

public class MergeSort {
    private int[] arrayData;

    public MergeSort(int[] array) {
        this.arrayData = array;
    }

    public void mergeSort() {
        mergeSort(arrayData);
    }

    private void mergeSort(int[] array) {
        int arrayLength = array.length, midPoint = arrayLength / 2, i;

        if (arrayLength < 2)
            return;

        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[(arrayLength - midPoint)];

        for (i = 0; i < midPoint; i++)
            leftArray[i] = array[i];
        for (i = midPoint; i < arrayLength; i++)
            rightArray[(i - midPoint)] = array[i];

        mergeSort(leftArray);
        System.out.println(Arrays.toString(leftArray));
        mergeSort(rightArray);
        System.out.println(Arrays.toString(rightArray));
        mrege(array, leftArray, rightArray);
        System.out.println(Arrays.toString(array));
    }

    private void mrege(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        for (; i < leftArray.length; i++, k++)
            array[k] = leftArray[i];
        for(; j < rightArray.length; j++, k++)
            array[k] = rightArray[j];
    }
}
