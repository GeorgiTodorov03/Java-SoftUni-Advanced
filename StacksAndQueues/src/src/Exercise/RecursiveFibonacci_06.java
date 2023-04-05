import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> stack = new ArrayDeque<>();

        stack.push(0L);
        stack.push(1L);

        if (n < 2) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i <= n - 1; i++) {
            long firstNum = stack.pop();
            long secondNum = stack.pop();
            stack.push(firstNum);
            stack.push(firstNum + secondNum);
        }
        System.out.println(stack.pop());
    }
}
