import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Double, Integer> countMap  = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(d -> {
                    int value = countMap.getOrDefault(d, 0);
                    countMap.put(d, value + 1);
                });

        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
