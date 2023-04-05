import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;


public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], String> count = stream -> "Count = " + stream.length;
        Function<int[], String> sum = stream -> "Sum = " + Arrays.stream(stream).sum();


        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(count.apply(numbers));
        System.out.println(sum.apply(numbers));

    }
}
