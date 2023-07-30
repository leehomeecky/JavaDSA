package Array.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }
    public void bubblesSort() {
        boolean bubble = true;
        int temp;

        while (bubble) {
            bubble = false;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[(i + 1)]) {
                    temp = array[(i + 1)];
                    array[(i + 1)] = array[i];
                    array[i] = temp;
                    bubble = true;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        
    }
}