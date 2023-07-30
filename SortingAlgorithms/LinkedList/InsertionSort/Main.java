package LinkedList.InsertionSort;

import java.util.List;
import LinkedList.ListData;

public class Main {
    public static void main(String... args) {
        ListData listData = new ListData();
        List<Integer> data = listData.listData();
        System.out.printf("%s\n\n", data);
        InsertionSort insertionSort = new InsertionSort(data);
        insertionSort.insertionSort();
        System.out.printf("\n%s", data);
    }
}
