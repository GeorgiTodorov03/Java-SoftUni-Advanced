import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondBox::push);

        int claimedLoot = 0;

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {

            int sum = 0;

            int firstBoxNumber = firstBox.peek();
            int secondBoxNumber = secondBox.peek();

            sum += firstBoxNumber + secondBoxNumber;

            if (sum % 2 == 0) {
                claimedLoot += sum;
                firstBox.poll();
                secondBox.pop();
            } else {
                secondBox.pop();
                firstBox.offer(secondBoxNumber);
            }


        }
        if (firstBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if (claimedLoot >= 100) {
            System.out.println("Your loot was epic! Value: " + claimedLoot);
        } else {
            System.out.println("Your loot was poor... Value: " + claimedLoot);

        }
    }
}
