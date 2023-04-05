package ListUtilities_04;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(13, 42, 69, 5);

        System.out.println(ListUtils.getMax(integerList));
        System.out.println(ListUtils.getMin(integerList));
    }
}
