import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endRange = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        Predicate<Integer> isDivisible = n -> {
            for (Integer number : numbers) {
                if ((n % number) != 0) {
                    return false;
                }
            }
            return true;
        };

        IntStream.rangeClosed(1, endRange).boxed().filter(isDivisible).forEach(e -> System.out.print(e + " "));

    }
}
