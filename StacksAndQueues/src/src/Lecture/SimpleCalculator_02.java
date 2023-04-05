package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        Deque<String> queue = new ArrayDeque<>();

        for (String element: tokens) {
            queue.offer(element);
        }

        while (queue.size() > 1) {
            int first = Integer.parseInt(queue.poll());
            String operator = queue.poll();
            int second = Integer.parseInt(queue.poll());

            switch (operator) {
                case "+":
                    queue.push(String.valueOf(first + second));
                    break;
                case "-":
                    queue.push(String.valueOf(first - second));
                    break;
            }
        }
        System.out.println(queue.poll());
    }
}
