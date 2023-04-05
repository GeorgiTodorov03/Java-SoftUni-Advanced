import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbols = new TreeMap<>();

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            int value = 0;

            symbols.putIfAbsent(currentSymbol, value);
            if (symbols.containsKey(currentSymbol)) {
                symbols.put(currentSymbol, symbols.get(currentSymbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }

    }
}
