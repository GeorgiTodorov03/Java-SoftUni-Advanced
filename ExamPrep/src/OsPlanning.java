import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OsPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);


        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int endTask = Integer.parseInt(scanner.nextLine());

        int currentTask = tasks.peek();
        int currentThread = threads.peek();

        while (currentTask != endTask) {

            if (currentThread >= currentTask) {
                tasks.pop();
            }
            threads.poll();

            currentTask = tasks.peek();
            currentThread = threads.peek();
        }

        System.out.println("Thread with value " + currentThread + " killed task " + currentTask);

        for (Integer thread : threads) {
            System.out.print(thread + " ");
        }
    }
}
