package LinkedList.BubbleSort;

import java.util.List;

public class BubbleSort {
    private List<Integer> data;

    public BubbleSort(List<Integer> data) {
        this.data = data;
    }

    public void bubbleSort() {
        boolean bubble = true;
        Integer temp;

        while (bubble) {
            bubble = false;
            for (Integer i = 0; i < (data.size() - 1); i++) {
                if (data.get(i) > data.get(i + 1)) {
                    temp = data.get(i);
                    data.set(i, data.get(i + 1));
                    data.set((i + 1), temp);
                    System.out.println(data);
                    bubble = true;
                }
            }
        }
    }
}
