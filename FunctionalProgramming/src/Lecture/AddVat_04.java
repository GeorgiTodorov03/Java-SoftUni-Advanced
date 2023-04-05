import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        DoubleUnaryOperator addVat = p -> p * 1.2;

        Consumer<double[]> printPrices = price -> {
            System.out.println("Prices with VAT:");
            System.out.println(Arrays.stream(price)
                    .map(addVat)
                    .mapToObj(d -> String.format("%.2f", d))
                    .collect(Collectors.joining(System.lineSeparator())));
        };

        printPrices.accept(prices);


    }
}
