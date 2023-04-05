import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvensOrOdds_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int begin = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        String evenOrOdd = scanner.nextLine();

        IntPredicate predicate = n -> evenOrOdd.equals("odd") == (n % 2 != 0);


        String output = IntStream.rangeClosed(begin, end)
                .filter(predicate)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
