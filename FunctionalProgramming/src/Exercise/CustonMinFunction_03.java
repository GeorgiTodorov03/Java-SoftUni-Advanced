import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustonMinFunction_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> function = n -> {
            int min = Integer.MAX_VALUE;
            for (int number : n) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };

        int min = function.apply(numbers);

        System.out.println(min);


        //Function<int[], Integer> function = n -> Collections.min(Arrays.stream(n).boxed().collect(Collectors.toList()));
        //int min = function.apply(numbers)
    }
}
