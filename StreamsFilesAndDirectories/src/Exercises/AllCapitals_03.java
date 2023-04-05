import java.io.*;
import java.util.Locale;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\Exercises Resources\\input.txt";

        FileReader file = new FileReader(input);

        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();

        while (line != null) {

            System.out.println(line.toUpperCase(Locale.ROOT));

            line = reader.readLine();
        }

    }
}
