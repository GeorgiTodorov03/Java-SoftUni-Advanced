package GenericBoxInteger_02;

import java.util.ArrayList;
import java.util.List;

public class BoxInteger<T> {
    private List<T> values;

    public BoxInteger() {
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
}
