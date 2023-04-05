import java.util.ArrayDeque;
import java.util.Scanner;

public class ReversedStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String element: input) {
            stack.push(element);
        }

        for (String number: stack) {
            if (stack.size() == 1) {
                System.out.print(stack.pop());
                break;
            }
            System.out.print(stack.pop() + " ");
        }
    }
}
