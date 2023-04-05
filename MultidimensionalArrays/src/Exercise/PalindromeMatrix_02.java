import java.util.Scanner;

public class PalindromeMatrix_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = fillMatrix(rows, cols);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }


    public static String[][] fillMatrix (int rows, int cols) {

        String[][] palindromeMatrix = new String[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                char startEndChar = (char) ('a' + r);
                char middle = (char) ('a' + r + c);

                palindromeMatrix[r][c] = String.valueOf(startEndChar) + middle + startEndChar;
            }
        }

        return palindromeMatrix;
    }
}
