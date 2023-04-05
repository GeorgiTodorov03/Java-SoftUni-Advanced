import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\inputLineNumbers.txt";

        FileReader file = new FileReader(input);

        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();
        int count = 1;

        while (line != null) {

            System.out.println(count + ". " + line);

            line = reader.readLine();
            count++;
        }
    }
}
