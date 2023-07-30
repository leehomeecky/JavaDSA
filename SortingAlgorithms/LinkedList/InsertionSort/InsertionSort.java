package LinkedList.InsertionSort;

import java.util.List;

public class InsertionSort {
    private List<Integer> data;

    public InsertionSort(List<Integer> data) {
        this.data = data;
    }

    public void insertionSort() {
        Integer temp;

        for (Integer i = 0; i < data.size(); i++) {
            if (i > 0 && data.get(i) < data.get(i - 1)) {
                temp = data.get(i);
                data.set(i, data.get(i - 1));
                data.set((i - 1), temp);
                System.out.println(data);
                i -= 2;
            }
        }
    }
}
