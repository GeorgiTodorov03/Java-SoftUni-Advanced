package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String currentUrl = "";

        Deque<String> backHistory = new ArrayDeque<>();
        Deque<String> forwardHistory = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (!backHistory.isEmpty()) {
                    forwardHistory.push(currentUrl);
                    currentUrl = backHistory.pop();

                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else if (input.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    backHistory.push(currentUrl);
                    currentUrl = forwardHistory.pop();

                }

            } else {
                if (!currentUrl.equals("")) {
                    backHistory.push(currentUrl);
                    forwardHistory.clear();
                }
                currentUrl = input;
            }


            System.out.println(currentUrl);

            input = scanner.nextLine();
        }
    }
}
