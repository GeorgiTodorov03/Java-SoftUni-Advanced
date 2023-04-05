import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\Georgi\\IdeaProjects\\Advanced\\StreamsFilesAndDirectories\\resources\\input.txt";

        Path paths = Paths.get(address);

        Stream<String> lines = Files.lines(paths).sorted();

        lines.forEach(System.out::println);
    }
}
