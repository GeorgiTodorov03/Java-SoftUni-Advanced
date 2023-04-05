import java.util.Arrays;
import java.util.Scanner;


public class Intersection_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        Character[][] firstMatrix = readMatrix(scanner, row, col);
        Character[][] secondMatrix = readMatrix(scanner, row, col);
        Character[][] intersection = firstMatrix.clone();

        for (int r = 0; r < firstMatrix.length; r++) {
            for (int c = 0; c < firstMatrix[r].length; c++) {
                if (firstMatrix[r][c] != secondMatrix[r][c]) {
                    intersection[r][c] = '*';
                }
            }
        }

        for (Character[] intersectionRow: intersection) {
            for (Character ch : intersectionRow) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }




    }

    private static Character[][] readMatrix(Scanner scanner, int row, int col) {
        Character[][] matrix = new Character[row][col];

        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(e -> e.charAt(0)).toArray(Character[]::new);
        }
        return matrix;
    }
}
