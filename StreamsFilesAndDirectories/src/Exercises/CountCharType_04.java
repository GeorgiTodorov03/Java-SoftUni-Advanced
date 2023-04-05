import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCharType_04 {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\Exercises Resources\\input.txt";

        FileReader file = new FileReader(input);

        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int punctuationCount = 0;

        while (line != null) {
            for (char c : line.toCharArray()) {
                char currentChar = c;

                boolean isPunctuation = currentChar == '!' || currentChar == '.' || currentChar == ',' || currentChar == '?';
                boolean isVowel = currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u';
                if (isVowel) {
                    vowelCount++;
                } else if (isPunctuation) {
                    punctuationCount++;
                } else if (currentChar == ' ') {
                    continue;
                } else {
                    consonantCount++;
                }
            }

            line = reader.readLine();
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Punctuation: " + punctuationCount);
    }
}