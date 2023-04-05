import java.util.*;
import java.util.stream.Collectors;

public class AverageGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> grades = new TreeMap<>();

        for (int i = 0; i < numberStudents; i++) {
            String[] studentAndGrade = scanner.nextLine().split("\\s+");
            String student = studentAndGrade[0];
            Double grade = Double.parseDouble(studentAndGrade[1]);

            grades.putIfAbsent(student, new ArrayList<>());
            grades.get(student).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            double avgGradeSum = 0;
            for (Double grade : entry.getValue()) {
                avgGradeSum += grade;
            }
            System.out.printf("%s -> %s (avg: %.2f)%n", entry.getKey(), entry.getValue().stream().map(d -> String.format("%.2f", d)).collect(Collectors.joining(" ")), avgGradeSum / entry.getValue().size());
        }

    }
}
