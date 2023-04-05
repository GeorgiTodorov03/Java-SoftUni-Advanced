import java.io.File;
import java.io.IOException;

public class ListFiles_07 {
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\resources\\Files-and-Streams";


        File file = new File(address);

            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.println(f.getName() + ": [" + f.length() + "]");
                    }
                }
            }
        }

    }

