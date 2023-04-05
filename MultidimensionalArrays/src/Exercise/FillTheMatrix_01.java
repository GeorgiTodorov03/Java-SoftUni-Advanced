import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);

        if (input[1].equals("A")) {
            for (int[] arr : patternA(size)) {
                for (int element : arr) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } else if (input[1].equals("B")) {
            for (int[] arr : patternB(size)) {
                for (int element : arr) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }


    }

    public static int[][] patternA (int size){
        int[][] matrixA = new int[size][size];

        int count = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrixA[row][col] = count;
                count++;
            }
        }
        return matrixA;
    }
    public static int[][] patternB (int size) {
        int[][] matrixB = new int[size][size];

        int count = 1;

        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrixB[row][col] = count;
                    count++;
                }


            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrixB[row][col] = count;
                    count++;
                }

            }
        }

        return matrixB;
    }
}
