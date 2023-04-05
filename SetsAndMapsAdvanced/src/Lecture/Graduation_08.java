import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> averageScores = new TreeMap<>();

        while (n-- > 0) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();

            int count = 0;
            double averageGrades = 0;
            for (int i = 0; i < grades.length; i++) {
                double currentGrade = grades[i];
                averageGrades += currentGrade;
                count++;
            }
            averageGrades = averageGrades / count;

            averageScores.put(name, averageGrades);
        }

        averageScores.entrySet().stream().forEach(entry ->
                System.out.println(entry.getKey() + " is graduated with " + entry.getValue()));
    }
}
