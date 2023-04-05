import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = fillMatrix(scanner);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            try {
                swap(matrix, input);
                for (String[] arr: matrix) {
                    for (String element: arr) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    public static String[][] fillMatrix (Scanner scanner) {

        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }

    public static void swap (String[][] matrix, String input) {
        Pattern pattern = Pattern.compile("swap\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)");
        Matcher matcher = pattern.matcher(input);

        int firstRow = -1, firstColumn = -1, secondRow = -1, secondColumn = -1;

        if (matcher.matches()) {
            firstRow = Integer.parseInt(matcher.group(1));
            firstColumn = Integer.parseInt(matcher.group(2));
            secondRow = Integer.parseInt(matcher.group(3));
            secondColumn = Integer.parseInt(matcher.group(4));
        }

        String temporary = matrix[firstRow][firstColumn];
        matrix[firstRow][firstColumn] = matrix[secondRow][secondColumn];
        matrix[secondRow][secondColumn] = temporary;
    }
}
