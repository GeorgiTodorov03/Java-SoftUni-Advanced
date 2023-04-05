import java.io.*;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectories\\resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));

        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(outputStream));

        String line = input.readLine();
        int lines = 1;

        while (line != null) {

            if (lines % 3 == 0) {
                output.write(line);
                output.newLine();

            }
             line = input.readLine();
            lines++;
        }

    }
}
