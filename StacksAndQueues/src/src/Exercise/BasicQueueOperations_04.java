import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] input = scanner.nextLine().split(" ");

            int countToAdd = Integer.parseInt(input[0]);
            int countToPop = Integer.parseInt(input[1]);
            int numberToSearch = Integer.parseInt(input[2]);

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            String[] numbersToAdd = scanner.nextLine().split("\\s+");
            for (int i = 0; i <= countToAdd - 1; i++) {
                queue.offer(Integer.parseInt(numbersToAdd[i]));
            }

            for (int i = 0; i <= countToPop - 1; i++) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                System.out.println(0);
            } else if (queue.contains(numberToSearch)) {
                System.out.println(true);
            } else {
                int minNumber = Collections.min(queue);
                System.out.println(minNumber);
            }
        }
    }


