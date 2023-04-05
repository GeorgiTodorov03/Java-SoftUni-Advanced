import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectories\\resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("output.txt");
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            } else {
                scanner.next();
            }
        }

outputStream.close();
    }
}
