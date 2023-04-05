import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rotation = scanner.nextLine().split("[()]");
        int rotationNumber = Integer.parseInt(rotation[1]);
        String input = scanner.nextLine();

        List<String> wordList = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            String currentWord = input;
            wordList.add(currentWord);
            if (currentWord.length() > maxLength) {
                maxLength = currentWord.length();
            }


            input = scanner.nextLine();
        }
        int row = wordList.size();
        int col = maxLength;

        char[][] matrix = new char[row][col];
        for (int r = 0; r < row; r++) {
            String currentWord = wordList.get(r);
            for (int c = 0; c < col; c++) {
                if (c < currentWord.length()) {
                    char currentChar = currentWord.charAt(c);
                    matrix[r][c] = currentChar;
                } else {
                    matrix[r][c] = ' ';
                }
            }
        }

        int degreesToRotate = rotationNumber % 360;

        switch (degreesToRotate) {

            case 0:
                for (int r = 0; r < row; r++) {
                    for (int c = 0; c < col; c++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;

            case 90:
                for (int c = 0; c < col; c++) {
                    for (int r = row - 1; r >= 0; r--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;

            case 180:
                for (int r = row - 1; r >= 0; r--) {
                    for (int c = col - 1; c >= 0 ; c--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;

            case 270:
                for (int c = col - 1; c >= 0; c--) {
                    for (int r = 0; r < row; r++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;


        }


    }
}
