import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeOfSets = scanner.nextLine().split("\\s+");
        int sizeFirst = Integer.parseInt(sizeOfSets[0]);
        int sizeSecond = Integer.parseInt(sizeOfSets[1]);


        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        while (sizeFirst-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        while (sizeSecond-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        System.out.println(firstSet.stream()
                .filter(secondSet::contains)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
