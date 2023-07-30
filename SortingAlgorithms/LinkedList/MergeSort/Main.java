package LinkedList.MergeSort;

import java.util.List;
import LinkedList.ListData;

public class Main {
    public static void main(String... args) {
        ListData listData = new ListData();
        List<Integer> data = listData.listData();
        System.out.printf("%s\n\n", data);
        MergeSort mergeSort = new MergeSort(data);
        mergeSort.mergeSort();
        System.out.printf("\n%s", data);
    }
}
