import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = fillMatrix(scanner, size);

        int row = 0;
        int col = 0;
        int sum1 = 0;

        while (row < matrix.length && col < matrix.length) {
            sum1 += matrix[row][col];
            row++;
            col++;
        }

        row = matrix.length - 1;
        col = 0;
        int sum2 = 0;

        while (row >= 0 && col < matrix.length) {
            sum2 += matrix[row][col];
            row--;
            col++;
        }

        System.out.println(Math.abs(sum1 - sum2));

    }

    public static int[][] fillMatrix (Scanner scanner, int size) {

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
