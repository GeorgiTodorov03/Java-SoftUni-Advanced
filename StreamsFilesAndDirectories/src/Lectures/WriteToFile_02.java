import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws  IOException {


        String path = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectories\\resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        int bytes = inputStream.read();

        Set<Character> punctuation = Set.of(',', '.', '!', '?');

        while (bytes != -1) {
            char symbol = (char) bytes;

            if (!punctuation.contains(symbol)) {
                outputStream.write(symbol);
            }

            bytes = inputStream.read();
            }
        outputStream.close();
    }
}
