import java.io.File;
import java.util.ArrayDeque;

public class FolderSize_08 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectoriesExercise\\resourcesExercise");
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);

        int sumOfBytes = 0;

        while (!directories.isEmpty()) {
            File current = directories.poll();
            File[] files = current.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    sumOfBytes += file.length();
                }
            }
        }

        System.out.println(sumOfBytes);
    }
}
