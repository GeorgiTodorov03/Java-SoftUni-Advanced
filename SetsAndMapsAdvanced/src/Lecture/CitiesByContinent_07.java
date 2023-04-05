import java.util.*;

public class CitiesByContinent_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());

            Map<String, List<String>> countries = continents.get(continent);
            countries.putIfAbsent(country, new ArrayList<>());
            countries.get(country).add(city);

        }

        continents.entrySet().stream()
                .forEach((entry -> {
            System.out.printf("%s:%n", entry.getKey());
            entry.getValue().entrySet().stream()
                    .forEach(innerEntry -> {
                String cities = String.join(", ", innerEntry.getValue());
                System.out.println(" " + innerEntry.getKey() + " -> " + cities);
            });

        }));
    }
}
