import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class NestedFolders_08 {
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\resources\\Files-and-Streams";

        File root = new File(address);

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            File file = queue.poll();

            System.out.println(file.getName());

            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    queue.offer(f);
                }
            }
        }
    }
}