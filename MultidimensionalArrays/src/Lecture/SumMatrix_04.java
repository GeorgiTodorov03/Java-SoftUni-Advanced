import java.util.Arrays;
import java.util.Scanner;

public class SumMatrix_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");

        int row = Integer.valueOf(dimensions[0]);
        int col = Integer.valueOf(dimensions[1]);

     int[][] matrix = new int[row][col];

     for (int i = 0; i < matrix.length; i++) {
         matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                 .mapToInt(Integer::parseInt).toArray();
     }
     int sum = 0;

     for (int r = 0; r < matrix.length ; r++) {
      for (int c = 0; c < matrix[r].length; c++) {
          sum += matrix[r][c];
      }
     }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
