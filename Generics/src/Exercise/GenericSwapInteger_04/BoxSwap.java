package GenericSwapInteger_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxSwap<T> {
    private List<T> values;

    public BoxSwap() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }
    public void swap(int first, int second) {
        Collections.swap(values, first, second);
    }
}
