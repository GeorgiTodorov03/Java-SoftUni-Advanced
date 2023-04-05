import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int countToAdd = Integer.parseInt(input[0]);
        int countToPop = Integer.parseInt(input[1]);
        int numberToSearch = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] numbersToAdd = scanner.nextLine().split("\\s+");
        for (int i = 0; i <= countToAdd - 1; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }

        for (int i = 0; i <= countToPop - 1; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(numberToSearch)) {
            System.out.println(true);
        } else {
            int minNumber = Collections.min(stack);
            System.out.println(minNumber);
        }
    }
}
