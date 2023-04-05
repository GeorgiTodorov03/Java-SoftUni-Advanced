import java.util.ArrayDeque;
import java.util.Scanner;

public class Brackets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();

        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i <= brackets.length() - 1; i++) {
            char currentBracket = brackets.charAt(i);

            if (currentBracket == '[' || currentBracket == '{' || currentBracket == '(') {
                openingBrackets.push(currentBracket);

            } else {
                if (openingBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpeningBracket = openingBrackets.pop();
                if (currentBracket == '}' && lastOpeningBracket != '{') {
                    isBalanced = false;
                    break;

                } else if (currentBracket == ']' && lastOpeningBracket != '[') {
                    isBalanced = false;
                    break;

                } else if (currentBracket == ')' && lastOpeningBracket != '(') {
                    isBalanced = false;
                    break;

                }
            }
        }

        if (isBalanced && openingBrackets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
