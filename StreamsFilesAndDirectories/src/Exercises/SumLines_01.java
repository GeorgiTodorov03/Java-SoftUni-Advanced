import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {


        String input = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\input.txt";

        FileReader file = new FileReader(input);

        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();

        while (line != null) {

            long sum = 0;

            for (char c : line.toCharArray()) {
                sum += c;
            }

            System.out.println(sum);
            line = reader.readLine();
        }
    }
}
