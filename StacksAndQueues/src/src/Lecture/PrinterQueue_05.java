package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<String> queue = new ArrayDeque<>();


        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                String output = queue.isEmpty()
                        ? "Printer is on standby"
                        : "Canceled " + queue.poll();
                System.out.println(output);

            } else {
                queue.offer(input);


            }


            input = scanner.nextLine();
        }

        for (String text : queue) {
            System.out.println(text);
        }
    }
}
