package pl.EDytor;

import java.util.List;

public class BubbleSort {

    public <Object extends Comparable<Object>> List<Object> sort(List<Object> input) {
        if (input == null) {
            throw new RuntimeException();
        }
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == null) {
                input.remove(i);
            }
        }
        if (input.size() != 1) {
            boolean swapped;
            int n = input.size() - 1;
            for (int j = 0; j < input.size(); j++) {
                swapped = false;
                for (int i = 0; i < n; i++) {
                    if (input.get(i).compareTo(input.get(i + 1)) > 0) {
                        swap(input, i, i + 1);
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
                n--;
            }
        }
        return input;
    }

    private <Object extends Comparable<Object>> void swap(List<Object> list, int index1, int index2) {
        Object temporary = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temporary);
    }
}
