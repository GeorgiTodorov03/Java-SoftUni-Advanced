import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int col = dimensions[1];

        int[][] firstMatrix = new int[rows][col];

        for (int i = 0; i < firstMatrix.length; i++) {
            firstMatrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        rows = dimensions[0];
        col = dimensions[1];

        int[][] secondMatrix = new int[rows][col];
        for (int i = 0; i < secondMatrix.length; i++) {
            secondMatrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        boolean isEqual = firstMatrix.length == secondMatrix.length && areArraysEqual(firstMatrix, secondMatrix);



        System.out.println(isEqual ? "equal" : "not equal");
    }

    private static boolean areArraysEqual (int[][] firstMatrix, int[][] secondMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {

            int[] firstArr = firstMatrix[i];
            int[] secondArr = secondMatrix[i];

            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int r = 0; r < firstArr.length; r++) {
                int firstNumber = firstArr[r];
                int secondNumber = secondArr[r];

                if (firstNumber != secondNumber) {
                    return false;
                }
            }
        }
        return true;
    }
}
