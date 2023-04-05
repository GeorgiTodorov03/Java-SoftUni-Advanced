package src;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, people);

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        while (queue.size() > 1) {

            for (int i = 1; i < n; i++)
                queue.offer(queue.poll());

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            cycle++;

        }
        System.out.println("Last is " + queue.poll());
    }


    public static boolean isPrime (int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


