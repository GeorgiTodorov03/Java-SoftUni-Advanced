import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUpperCase_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");

        Predicate<String> isStartingUpperCase = w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> queueWords = new ArrayDeque<>();

        Arrays.stream(data)
                .filter(isStartingUpperCase)
                .forEach(w -> queueWords.offer(w));

        System.out.println(queueWords.size());

        while (!queueWords.isEmpty()) {
            System.out.println(queueWords.poll());
        }
    }
}
