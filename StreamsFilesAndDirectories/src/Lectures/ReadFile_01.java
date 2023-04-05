import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_01 {
    public static void main(String[] args) {


        String path = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectories\\resources\\input.txt";

       try {
           FileInputStream inputStream = new FileInputStream(path);
           int oneByte = inputStream.read();
           while (oneByte != -1) {
               System.out.print(Integer.toBinaryString(oneByte) + " ");
               oneByte = inputStream.read();
           }
           System.out.println();
       }

       catch (IOException e) {
           e.printStackTrace();
       }
    }
}
