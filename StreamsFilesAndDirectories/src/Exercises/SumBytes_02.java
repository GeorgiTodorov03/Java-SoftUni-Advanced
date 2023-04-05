import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {


        String input = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise\\input.txt";

        FileReader file = new FileReader(input);

        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();
        long sum = 0;

        while (line != null) {

            for (char c : line.toCharArray()) {
                sum += c;
            }

            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
