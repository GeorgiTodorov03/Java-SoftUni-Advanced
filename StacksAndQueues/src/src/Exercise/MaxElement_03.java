import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaxElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= n - 1; i++) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("1")) {
                stack.push(Integer.valueOf(command[1]));

            } else if (command[0].equals("2")) {
                stack.pop();
            } else {
                int maxNumber = Collections.max(stack);
                System.out.println(maxNumber);
            }
        }
    }
}
