package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        Deque<Integer> brackets = new ArrayDeque<>();

        for (int i = 0; i <= expression.length() - 1; i++) {
            char currentChar = expression.charAt(i);

            if (currentChar == '(') {
                brackets.push(i);
            } else if (currentChar == ')') {
                int startIndex = brackets.pop();
                String contents = expression.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
