import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();


        while (n-- > 0) {
            String[] currentElements = scanner.nextLine().split("\\s+");

            for (int i = 0; i < currentElements.length; i++) {
                String element = currentElements[i];
                if (!elements.contains(element)) {
                    elements.add(element);
                }
            }
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
