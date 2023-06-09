import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(numbers);

        int magicNumber = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> remove = num -> num % magicNumber == 0;

        numbers.removeIf(remove);

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
