package LinkedList.SelectionSort;

import java.util.List;

public class SelectionSort {
    private List<Integer> data;

    public SelectionSort(List<Integer> data) {
        this.data = data;
    }
    
    private static Integer select(Integer pos, List<Integer> data) {
        Integer min, minPos, i, result;

        minPos = pos;
        min = data.get(pos);
        for (i = pos; i < data.size(); i++) {
            if (data.get(i) < min) {
                min = data.get(i);
                minPos = i;
            }
        }
        result = (minPos != pos) ? minPos : null;
        return result;
    }

    public void selectionSort() {
        Integer i, temp, pos;

        for (i = 0; i < data.size(); i++) {
            pos = select(i, data);
            if (pos != null) {
                temp = data.get(i);
                data.set(i, data.get(pos));
                data.set(pos, temp);
                System.out.println(data);
            }
        }
    }
}
