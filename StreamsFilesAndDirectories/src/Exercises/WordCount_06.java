import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        Scanner wordScanner = new Scanner(new FileReader("C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\Exercises Resources\\words.txt"));
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] wordsToSearch = wordScanner.nextLine().split(" ");
        for (String word : wordsToSearch) {
        map.put(word, 0);
        }

        Scanner fileScanner = new Scanner(new FileReader("C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\Exercises Resources\\text.txt"));

        String singleWord = fileScanner.next();

        while (fileScanner.hasNext()) {

            if (map.containsKey(singleWord)) {
                int occurrences = map.get(singleWord);
                occurrences++;
                map.put(singleWord, occurrences);
            }

            singleWord = fileScanner.next();
        }

        map.entrySet().stream().forEach( entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));

        fileScanner.close();
        wordScanner.close();
    }

}
