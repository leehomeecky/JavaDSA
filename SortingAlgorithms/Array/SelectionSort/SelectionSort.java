package Array.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    private static int selact(int pos, int[] array) {
        int i, min, minPos, result;

        min = array[pos];
        minPos = pos;
        for (i = pos; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minPos = i;
            }
        }
        result = (minPos != pos) ? minPos : -1;
        return result;
    }

    public void selectionSort() {
        int i, pos, temp;

        for (i = 0; i < array.length; i++) {
            pos = selact(i, array);
            if (pos >= 0) {
                temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
                System.out.println(Arrays.toString(array));
            }
        }
    }
    
}
