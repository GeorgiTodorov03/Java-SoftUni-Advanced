import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> products = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String store = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            products.putIfAbsent(store, new LinkedHashMap<>());
            products.get(store).put(product, price);

            input = scanner.nextLine();
        }

        products.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry ->{
                    System.out.printf("%s->%n",entry.getKey());
                    entry.getValue()
                            .forEach((product, price) -> System.out.printf("Product: %s, Price: %.1f%n", product, price));
                });

        }

    }

