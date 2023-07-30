package Array.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }
    public void insertionSort() {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] < arr[(i - 1)]) {
                temp = arr[(i - 1)];
                arr[(i - 1)] = arr[i];
                arr[i] = temp;
                i -= 2;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
