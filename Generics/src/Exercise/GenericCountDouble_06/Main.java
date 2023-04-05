package GenericCountDouble_06;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();

        for (int i = 0; i < n; i++) {
            Double element = Double.parseDouble(scanner.nextLine());
            box.add(element);
        }

        double compareElement = Double.parseDouble(scanner.nextLine());
        System.out.println(box.compare(compareElement));
    }
}
