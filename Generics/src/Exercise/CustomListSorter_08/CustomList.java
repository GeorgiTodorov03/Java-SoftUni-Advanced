package CustomListSorter_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }
    public T remove(int index) {
       return values.remove(index);

    }
    public boolean contains(T element) {
        return values.contains(element);
    }
    public void swap(int first, int second) {
        Collections.swap(values, first, second);
    }
    public int countGreaterThan(T element) {
        return (int) values.stream()
                .filter(eFromList -> eFromList.compareTo(element) > 0)
                .count();
    }

    public T getMax() {
       return values.stream().max(Comparable::compareTo).get();
    }
    public T getMin() {
        return values.stream().min(Comparable::compareTo).get();
    }

public int size () {
        return values.size();
}

public T get (int index) {
        return values.get(index);
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(value.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
