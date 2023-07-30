package Array.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        int array[] = { 19, 48, 99, 71, 13, 52, 96, 73, 86, 7 };
        System.out.printf("%s\n\n", Arrays.toString(array));
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.mergeSort();
        System.out.printf("\n%s", Arrays.toString(array));
    }
}
