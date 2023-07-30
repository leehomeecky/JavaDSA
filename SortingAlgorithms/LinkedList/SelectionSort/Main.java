package LinkedList.SelectionSort;

import java.util.List;
import LinkedList.ListData;

public class Main {
    public static void main(String... args) {
        ListData listData = new ListData();
        List<Integer> data = listData.listData();
        System.out.printf("%s\n\n", data);
        SelectionSort selectionSort = new SelectionSort(data);
        selectionSort.selectionSort();
        System.out.printf("\n%s", data);
    }
}
