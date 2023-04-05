import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectories\\resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        PrintWriter printWriter = new PrintWriter(outputStream);

        int bytes = inputStream.read();


        while (bytes != -1) {

            if (bytes == 10 || bytes == 32) {
                outputStream.write(bytes);
            } else {
                String digits = String.valueOf(bytes);
                for (int i = 0; i < digits.length(); i++) {
                    outputStream.write(digits.charAt(i));
                }
            }
            bytes = inputStream.read();
        }
        outputStream.close();
    }
}
